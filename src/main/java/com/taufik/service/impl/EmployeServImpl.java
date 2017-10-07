package com.taufik.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taufik.mapper.EmployeeMapper;
import com.taufik.model.Employee;
import com.taufik.service.EmployeeService;

@Service
public class EmployeServImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper mapper;
	public List<Employee> getAllCategori() throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAllCategori();
	}

	public Employee getSingleCategori(int id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getSingleCategori(id);
	}

	public boolean save(Employee categori) throws Exception {
		// TODO Auto-generated method stub
		return mapper.save(categori);
	}

	public boolean update(Employee categori) throws Exception {
		// TODO Auto-generated method stub
		return mapper.update(categori);
	}

	public boolean delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delete(id);
	}

	public void getCategoriByHierarchy(Map<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		mapper.getCategoriByHierarchy(params);
		
	}

}
