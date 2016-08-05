package org.khmerslide.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmerslide.entities.View_History;
import org.khmerslide.model.InputView_History;
import org.khmerslide.services.ViewHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/viewhistory")
public class ViewHistoryController {
	@Autowired
	private ViewHistoryService  viewhistoryService;
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET,headers="Accept=Application/json")
	public ResponseEntity<Map<String, Object>> getViewHistory(){
		Map<String , Object> map = new HashMap<String , Object>();
		try{
			ArrayList<View_History> vh = viewhistoryService.getViewHistory();
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
	
	@RequestMapping(method = RequestMethod.POST, headers="Accept=Application/json")
	public ResponseEntity<Map<String , Object>> addViewHistory(@RequestBody InputView_History viewhistory){
		Map<String,Object> map = new HashMap<String, Object>();
		try{
			View_History vh = new View_History();
			vh.setVh_id(viewhistory.getVh_id());
			vh.setAdded_date(viewhistory.getAdded_date());
			vh.setUser_id(viewhistory.getUser_id());
			vh.setDoc_id(viewhistory.getDoc_id());
			vh.setDescription(viewhistory.getDescription());
			
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
	
	@RequestMapping(method=RequestMethod.PUT, headers = "Accept=Application/json")
	public ResponseEntity<Map<String, Object>> updateViewHisotry(@RequestBody View_History vh){
		Map<String, Object> map = new HashMap<String , Object>();
		try{
			if(viewhistoryService.updateViewHistory(vh)){
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
	
	@RequestMapping(value="/{vh_id}" , method = RequestMethod.DELETE, headers="Accept=Application/json")
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
