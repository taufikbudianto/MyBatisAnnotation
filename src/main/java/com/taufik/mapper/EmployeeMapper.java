package com.taufik.mapper;

import java.util.List;
import java.util.Map;

import com.taufik.model.Employee;

public interface EmployeeMapper {
	
	public List<Employee> getAllCategori() throws Exception;

	public Employee getSingleCategori(int id) throws Exception;

	public boolean save(Employee categori) throws Exception;

	public boolean update(Employee categori) throws Exception;

	public boolean delete(int id) throws Exception;
	
	public void getCategoriByHierarchy(Map<String,Object> params) throws Exception;
}
