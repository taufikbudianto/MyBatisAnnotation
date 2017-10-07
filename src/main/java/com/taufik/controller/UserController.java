package com.taufik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.taufik.model.User;
import com.taufik.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	UserService userServ;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Boolean> saveData(@RequestBody User user){
		System.out.println(user.getLastname());
		try {
			boolean result = userServ.insert(user);
			return new ResponseEntity<Boolean>(result,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Boolean>(false,HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ResponseEntity<List<User>> getAllEmployee(){
		try {
			List<User> list = userServ.getAllUser();
			return new ResponseEntity<List<User>>(list,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value = "/getDataById", method = RequestMethod.GET)
	public ResponseEntity<User> getData() {
		try {
			User emp = userServ.getSingleUser(1);
			System.out.println(emp.getFirstname());
			return new ResponseEntity<User>(emp,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping(value = "/deleteById", method = RequestMethod.GET)
	public ResponseEntity<Boolean> deleteById(){
		try {
			boolean res = userServ.delete(3);
			return new ResponseEntity<Boolean>(res,HttpStatus.OK);
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Boolean>(false,HttpStatus.INTERNAL_SERVER_ERROR);
					
		}
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public ResponseEntity<Boolean> update(@RequestBody User user){
		try {
			boolean result = userServ.update(user);
			return new ResponseEntity<Boolean>(result,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Boolean>(false,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
