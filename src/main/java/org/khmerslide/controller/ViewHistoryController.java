package org.khmerslide.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmerslide.entities.Document;
import org.khmerslide.entities.User;
import org.khmerslide.entities.View_History;
import org.khmerslide.model.InputView_History;
import org.khmerslide.model.InputView_History.UpdateViewHistory;
import org.khmerslide.services.ViewHistoryService;
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
@RequestMapping("/api/viewhistory")
public class ViewHistoryController {
	@Autowired
	private ViewHistoryService  viewhistoryService;
	@ResponseBody
	@RequestMapping(value={"/get-viewhistory"},method=RequestMethod.GET,headers="Accept=Application/json")
	public ResponseEntity<Map<String, Object>> getViewHistory(@RequestParam("page") int page, @RequestParam("limit") int limit){
		Map<String , Object> map = new HashMap<String , Object>();
		Pagination pagination = new Pagination();
		pagination.setPage(page);
		pagination.setLimit(limit);
		try{
			ArrayList<View_History> vh = viewhistoryService.getViewHistory(pagination);
			if(!vh.isEmpty()){
				map.put("DATA", vh);
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
	@RequestMapping(value={"/get-viewhistory/{vh_id}"},method=RequestMethod.GET,headers="Accept=Application/json")
	public ResponseEntity<Map<String, Object>> getViewHistoryById(@PathVariable("vh_id") int vh_id){
		Map<String , Object> map = new HashMap<String , Object>();
		try{
			ArrayList<View_History> vh = viewhistoryService.getViewHistoryById(vh_id);
			if(!vh.isEmpty()){
				map.put("DATA", vh);
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
	
	@RequestMapping(value={"/add-viewhistory"},method = RequestMethod.POST, headers="Accept=Application/json")
	public ResponseEntity<Map<String , Object>> addViewHistory(@RequestBody InputView_History viewhistory){
		Map<String,Object> map = new HashMap<String, Object>();
		try{
			View_History vh = new View_History();
	
			vh.setAdded_date(viewhistory.getAdded_date());
				User U = new User();
					U.setUser_id(viewhistory.getUser_id());
			vh.setUser(U);
				Document D = new Document();
					D.setDoc_id(viewhistory.getDoc_id());
			vh.setDoc(D);
			vh.setDescription(viewhistory.getDescription());
			vh.setStatus(viewhistory.getStatus());
			if(viewhistoryService.addViewHistory(vh)){
				map.put("MESSAGE", "ADD VIEW HISTORY");
				map.put("STATUS", true);
			}else{
				map.put("MESSAGE", "NOT ADD VIEW HISTORY");
				map.put("STATUS", false);
			}
		}catch(Exception e){
			map.put("MESSAGE", "Error!");
			map.put("STATUS", false);
			e.printStackTrace();
		}
		return new ResponseEntity<Map<String,Object>>(map , HttpStatus.OK);
		
	}
	
	@RequestMapping(value={"/update-viewhistory/{vh_id}"},method=RequestMethod.PUT, headers = "Accept=Application/json")
	public ResponseEntity<Map<String, Object>> updateViewHisotry(@PathVariable("vh_id") int vh_id,@RequestBody UpdateViewHistory viewhistory){
		Map<String, Object> map = new HashMap<String , Object>();
		try{
			View_History  VH = new View_History();
				VH.setVh_id(vh_id);
					Document D = new Document();
						D.setDoc_id(viewhistory.getDoc_id());
				VH.setDoc(D);
				VH.setDescription(viewhistory.getDescription());
				VH.setStatus(viewhistory.getStatus());
			
			if(viewhistoryService.updateViewHistory(VH)){
				map.put("MESSAGE", "UPDATE VIEW HISTORY");
				map.put("STATUS", true);
			}else{
				map.put("MESSAGE", "NOT UPDATE VIEW HISTORY");
				map.put("STATUS", false);
			}
		}catch(Exception e){
			map.put("MESSAGE", "Error!");
			map.put("STATUS", false);
			e.printStackTrace();
		}
		return new ResponseEntity<Map<String,Object>>(map , HttpStatus.OK);
	}
	
	@RequestMapping(value="/delete-viewhistory/{vh_id}" , method = RequestMethod.DELETE, headers="Accept=Application/json")
	public ResponseEntity<Map<String , Object>> deleteUser(@PathVariable("vh_id") int vh_id){
		Map<String , Object> map = new HashMap<String,Object>();
		try{
			if(viewhistoryService.deleteViewHistory(vh_id)){
				map.put("MESSAGE", "DELETE VIEW HISTORY");
				map.put("STATUS" , true);
			}else{
				map.put("MESSAGE", "NOT DELETE VIEW HISTORY");
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
