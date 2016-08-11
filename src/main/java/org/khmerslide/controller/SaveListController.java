package org.khmerslide.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmerslide.entities.Document;
import org.khmerslide.entities.Save_List;
import org.khmerslide.model.InputSave_List.updateSaveList;
import org.khmerslide.entities.User;
import org.khmerslide.model.InputDocument;
import org.khmerslide.model.InputSave_List;
import org.khmerslide.services.SaveListService;
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

import ch.qos.logback.core.net.SyslogOutputStream;

@Controller
@RequestMapping(value="/api/savelist")
public class SaveListController {
	@Autowired
	private SaveListService  savelistService;
	
	@ResponseBody
	@RequestMapping(value={"/get-getsavelist"},method=RequestMethod.GET,headers="Accept=Application/json")
	public ResponseEntity<Map<String, Object>> getSaveListById(@RequestParam("page") int page, @RequestParam("limit") int limit){
		Map<String , Object> map = new HashMap<String , Object>();
		Pagination pagination = new Pagination();
		pagination.setPage(page);
		pagination.setLimit(limit);
		try{
			ArrayList<Save_List> savelist = savelistService.getSaveList(pagination);
			if(!savelist.isEmpty()){
				map.put("DATA", savelist);
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
	@RequestMapping(value={"/get-getsavelist/{sl_id}"},method=RequestMethod.GET,headers="Accept=Application/json")
	public ResponseEntity<Map<String, Object>> getSaveListById(@PathVariable("sl_id") int sl_id){
		Map<String , Object> map = new HashMap<String , Object>();
		try{
			ArrayList<Save_List> savelist = savelistService.getSaveListById(sl_id);
			if(!savelist.isEmpty()){
				map.put("DATA", savelist);
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
	
	@RequestMapping(value={"/add-savelist"},method = RequestMethod.POST, headers="Accept=Application/json")
	public ResponseEntity<Map<String , Object>> addSaveList(@RequestBody InputSave_List savelist){
		Map<String,Object> map = new HashMap<String, Object>();
		try{
			Save_List sl = new Save_List();
			sl.setSl_name(savelist.getSl_name());
			sl.setSaved_date(savelist.getSaved_date());
			sl.setStatus(savelist.getStatus());
				User u = new User();
					u.setUser_id(savelist.getUser_id());
			sl.setUser(u);
				Document  d = new Document();
					d.setDoc_id(savelist.getDoc_id());
				sl.setDoc(d);
			sl.setDescription(savelist.getDescription());
			
			if(savelistService.addSaveList(sl)){
				map.put("MESSAGE", "ADD SAVELIST");
				map.put("STATUS", true);
			}else{
				map.put("MESSAGE", "NOT ADD SAVELIST");
				map.put("STATUS", false);
			}
		}catch(Exception e){
			map.put("MESSAGE", "Error!");
			map.put("STATUS", false);
			e.printStackTrace();
		}
		return new ResponseEntity<Map<String,Object>>(map , HttpStatus.OK);
		
	}
	
	@RequestMapping(value={"/update-savelist/{sl_id}"},method=RequestMethod.PUT, headers = "Accept=Application/json")
	public ResponseEntity<Map<String, Object>> updateSaveList(@PathVariable("sl_id") int sl_id,@RequestBody updateSaveList updatesl){
		Map<String, Object> map = new HashMap<String , Object>();
		try{
			Save_List sl = new Save_List();
				sl.setSl_id(sl_id);
				sl.setSl_name(updatesl.getSl_name());
				sl.setStatus(updatesl.getStatus());
					Document  d = new Document();
						d.setDoc_id(updatesl.getDoc_id());
				sl.setDoc(d);
				sl.setDescription(updatesl.getDescription());
			if(savelistService.updateSaveList(sl)){
				map.put("MESSAGE", "UPDATE SAVELIST");
				map.put("STATUS", true);
			}else{
				map.put("MESSAGE", "NOT UPDATE SAVELIST");
				map.put("STATUS", false);
			}
		}catch(Exception e){
			map.put("MESSAGE", "Error!");
			map.put("STATUS", false);
			e.printStackTrace();
		}
		return new ResponseEntity<Map<String,Object>>(map , HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value="/delete-savelist/{sl_id}" , method = RequestMethod.DELETE, headers="Accept=Application/json")
	public ResponseEntity<Map<String , Object>> deleteUser(@PathVariable("sl_id") int sl_id){
		Map<String , Object> map = new HashMap<String,Object>();
		try{
			if(savelistService.deleteSaveList(sl_id)){
				map.put("MESSAGE", "SAVELIST DELETE");
				map.put("STATUS" , true);
			}else{
				map.put("MESSAGE", "SAVELIST NOT DELETE");
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
