package org.khmerslide.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmerslide.entities.User;
import org.khmerslide.entities.User_Type;
import org.khmerslide.model.FormUserInput;

import org.khmerslide.model.FormUserUpdate;
import org.khmerslide.model.FormUserUpdateStatus;
import org.khmerslide.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//idovbcb

@Controller
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserService  userService;
	@ResponseBody
	@RequestMapping(value={"/get-user"},method=RequestMethod.GET, headers="Accept=Application/json")
	public ResponseEntity<Map<String, Object>> getUser(){
		Map<String , Object> map = new HashMap<String , Object>();
		try{
			ArrayList<User> users = userService.getUser();
			if(!users.isEmpty()){
				map.put("DATA", users);
				map.put("STATUS", true);
				map.put("MESSAGE", "DATA FOUND!");
			}else{
				map.put("STATUS", true);
				map.put("MESSAGE", "DATA NOT FOUND!");
			}
		}catch(Exception e){
			map.put("STATUS", false);
			map.put("MESSAGE", "ERROR!");
			e.printStackTrace();
		}
		return new ResponseEntity<Map<String, Object>>(map ,HttpStatus.OK) ;
	}
	
	@ResponseBody
	@RequestMapping(value="/get-user/{id}" , method = RequestMethod.GET, headers="Accept=Application/json")
	public ResponseEntity<Map<String , Object>> getUserById(@PathVariable("id") int id){
		Map<String , Object> map = new HashMap<String,Object>();
		try{
			ArrayList<User> users = userService.getUserById(id);
			if(!users.isEmpty()){
				map.put("DATA", users);
				map.put("STATUS", true);
				map.put("MESSAGE", "DATA FOUND!");
			}else{
				map.put("STATUS", true);
				map.put("MESSAGE", "DATA NOT FOUND!");
			}
		}catch(Exception e){
			map.put("STATUS", false);
			map.put("MESSAGE", "ERROR!");
			e.printStackTrace();
		}
		return new ResponseEntity<Map<String, Object>>(map ,HttpStatus.OK) ;
	}
	

	
	
	
	
	
	@RequestMapping(value={"/add-user"},method = RequestMethod.POST, headers="Accept=Application/json")
	public ResponseEntity<Map<String , Object>> addUser(@RequestBody FormUserInput inputUser){
		Map<String,Object> map = new HashMap<String, Object>();
		try{
			User u = new User();
			u.setUser_name(inputUser.getUser_name());
			u.setGender(inputUser.getGender());
			u.setEmail(inputUser.getEmail());
			u.setPassword(inputUser.getPassword());
			u.setPhoto(inputUser.getPhoto());
			u.setRegistered_date(inputUser.getRegistered_date());
		
			u.setStatus(inputUser.getStatus());			
			User_Type  ut = new User_Type();
					ut.setRole_id(inputUser.getRole_id());
			u.setRole(ut);
			
			if(userService.addUser(u)){
				map.put("MESSAGE", "ADD USER");
				map.put("STATUS", true);
			}else{
				map.put("MESSAGE", "NOT ADD USER");
				map.put("STATUS", false);
			}
		}catch(Exception e){
			map.put("MESSAGE", "Error!");
			map.put("STATUS", false);
			e.printStackTrace();
		}
		return new ResponseEntity<Map<String,Object>>(map , HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value="/update-user-status" ,method = RequestMethod.PUT, headers="Accept=Application/json")
	public ResponseEntity<Map<String , Object>> setChangeStatusUser(@RequestBody FormUserUpdateStatus status){
		Map<String,Object> map = new HashMap<String, Object>();
		try{
			if(userService.setChangeStatusUser(status)){
				map.put("MESSAGE", "USER HAVE BEEN DELETE");
				map.put("STATUS", true);
			}else{
				map.put("MESSAGE", "NOT CANNOT BE DELETE");
				map.put("STATUS", false);
			}
		}catch(Exception e){
			map.put("MESSAGE", "Error!");
			map.put("STATUS", false);
			e.printStackTrace();
		}
		return new ResponseEntity<Map<String,Object>>(map , HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value={"/update-user"},method=RequestMethod.PUT, headers = "Accept=Application/json")
	public ResponseEntity<Map<String, Object>> updateUser(@RequestBody FormUserUpdate user){
		Map<String, Object> map = new HashMap<String , Object>();
		try{
			if(userService.updateUser(user)){
				map.put("MESSAGE", "USER UPDATE");
				map.put("STATUS", true);
			}else{
				map.put("MESSAGE", "USER NOT UPDATE");
				map.put("STATUS", false);
			}
		}catch(Exception e){
			map.put("MESSAGE", "Error!");
			map.put("STATUS", false);
			e.printStackTrace();
		}
		return new ResponseEntity<Map<String,Object>>(map , HttpStatus.OK);
	}
	
	@RequestMapping(value="/delete-user/{id}" , method = RequestMethod.DELETE, headers="Accept=Application/json")
	public ResponseEntity<Map<String , Object>> deleteUser(@PathVariable("id") int id){
		Map<String , Object> map = new HashMap<String,Object>();
		try{
			if(userService.deleteUser(id)){
				map.put("MESSAGE", "USER DELETE");
				map.put("STATUS" , true);
			}else{
				map.put("MESSAGE", "USER NOT DELETE");
				map.put("STATUS" , false);
			}
		}catch(Exception e){
			e.printStackTrace();
			map.put("MESSAGE", "Error!");
			map.put("STATUS" , false);
		}
		return new ResponseEntity<Map<String,Object>>(map , HttpStatus.OK);
	}
	
}	

