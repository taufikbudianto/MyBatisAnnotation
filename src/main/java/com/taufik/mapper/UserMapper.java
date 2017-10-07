package com.taufik.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.taufik.model.User;

public interface UserMapper {

	@Select("SELECT user_id as id,email,first_name as firstname,last_name as lastname,password FROM user")
	public List<User> getAllUser() throws Exception;

	@Select("SELECT user_id as id,email,first_name as firstname,last_name as lastname,password FROM user U WHERE U.user_id = #{ID}")
	public User getSingleUser(int id) throws Exception;

	@Insert("INSERT INTO user(user_id,email, first_name, last_name, password) VALUES (#{id, jdbcType=VARCHAR},#{email, jdbcType=VARCHAR}, #{firstname, jdbcType=VARCHAR}, #{lastname, jdbcType=VARCHAR}, #{password, jdbcType=VARCHAR})")
	// @Options(useGeneratedKeys=true, keyProperty="ID",
	// flushCache=FlushCachePolicy.TRUE, keyColumn="ID")
	public boolean insert(User user) throws Exception;

	@Update("UPDATE user SET email=#{email, jdbcType=VARCHAR}, first_name=#{firstname, jdbcType=VARCHAR}, last_name=#{lastname, jdbcType=VARCHAR}, password=#{password, jdbcType=VARCHAR} WHERE user_id=#{id}")
	public boolean update(User user) throws Exception;

	@Delete("DELETE FROM user WHERE user_id = #{ID}")
	public boolean delete(int id) throws Exception;
}
