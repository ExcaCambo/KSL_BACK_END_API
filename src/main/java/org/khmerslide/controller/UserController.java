package org.khmerslide.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmerslide.entities.User;
import org.khmerslide.entities.User_Type;
import org.khmerslide.model.InputUser;
import org.khmerslide.services.UserService;
import org.khmerslide.utilities.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserService  userService;
	@ResponseBody
	@RequestMapping(value={"/get-user"},method=RequestMethod.GET, headers="Accept=Application/json")
	public ResponseEntity<Map<String, Object>> getUser(@RequestParam("page") int page, @RequestParam("limit") int limit){
		Map<String , Object> map = new HashMap<String , Object>();
		Pagination pagination = new Pagination();
		pagination.setPage(page);
		pagination.setLimit(limit);
		try{
			ArrayList<User> users = userService.getUser(pagination);
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
	@RequestMapping(value="/get-user-by-id/{user_id}",method=RequestMethod.GET, headers="Accept=Application/json")
	public ResponseEntity<Map<String, Object>> getUserById(@PathVariable("user_id") int user_id){
		Map<String , Object> map = new HashMap<String , Object>();
		try{
			ArrayList<User> user = userService.getUserById(user_id);
			
			if(!user.isEmpty()){
				map.put("DATA", user);
				map.put("STATUS", true);
				map.put("MESSAGE", "DATA FOUND!");
			}else{
				map.put("STATUS", false);
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
	public ResponseEntity<Map<String , Object>> addUser(@RequestBody InputUser.InsertUser user){
		Map<String,Object> map = new HashMap<String, Object>();
		try{
			User u = new User();
			u.setUser_name(user.getUser_name());
			u.setGender(user.getGender());
			u.setEmail(user.getEmail());
			u.setPassword(user.getPassword());
			u.setRegistered_date(user.getRegistered_date());
			u.setPhoto(user.getPhoto());
			u.setDescription(user.getDescription());
			u.setStatus(user.getStatus());
			User_Type  ut = new User_Type();
					ut.setRole_id(user.getRole());
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
	
	@RequestMapping(value={"/update-user/{user_id}"},method=RequestMethod.PUT, headers = "Accept=Application/json")
	public ResponseEntity<Map<String, Object>> updateUser(@PathVariable("user_id") int user_id,@RequestBody InputUser.UpdateUser updateuser){
		Map<String, Object> map = new HashMap<String , Object>();
		try{
			User U = new User();
			U.setUser_id(user_id);
			U.setUser_name(updateuser.getUser_name());
			U.setGender(updateuser.getGender());
			U.setEmail(updateuser.getEmail());
			U.setPassword(updateuser.getPassword());
			U.setPhoto(updateuser.getPhoto());
			U.setDescription(updateuser.getDescription());
				User_Type  ut =new User_Type();
					ut.setRole_id(updateuser.getRole());
			U.setRole(ut);
			if(userService.updateUser(U)){
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
	
	@RequestMapping(value="/delete-user/{user_id}" , method = RequestMethod.DELETE, headers="Accept=Application/json")
	public ResponseEntity<Map<String , Object>> deleteUser(@PathVariable("user_id") int user_id){
		Map<String , Object> map = new HashMap<String,Object>();
		try{
			if(userService.deleteUser(user_id)){
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

