package org.khmerslide.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmerslide.entities.Category;
import org.khmerslide.entities.Document;
import org.khmerslide.model.InputCategory;
import org.khmerslide.model.InputDocument;
import org.khmerslide.services.CategoryService;
import org.khmerslide.services.DocumentService;
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
@RequestMapping(value="/api/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET,headers="Accept=Application/json")
	public ResponseEntity<Map<String, Object>> getCategory(){
		Map<String , Object> map = new HashMap<String , Object>();
		try{
			ArrayList<Category> cateogry = categoryService.getCategory();
			if(!cateogry.isEmpty()){
				map.put("DATA", cateogry);
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
	public ResponseEntity<Map<String , Object>> addCategory(@RequestBody InputCategory category){
		Map<String,Object> map = new HashMap<String, Object>();
		try{
			Category cat = new Category();
			cat.setCat_id(category.getCat_id());
			cat.setParent_id(category.getParent_id());
			cat.setCat_name(category.getCat_name());
			cat.setCreated_date(category.getCreated_date());
			cat.setStatus(category.getStatus());
			cat.setUser_id(category.getU_id());
			cat.setDescription(category.getDescription());
			if(categoryService.addCategory(cat)){
				map.put("MESSAGE", "ADD CATEGORY");
				map.put("STATUS", true);
			}else{
				map.put("MESSAGE", "NOT ADD CATEGORY");
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
	public ResponseEntity<Map<String, Object>> updateCategory(@RequestBody Category category){
		Map<String, Object> map = new HashMap<String , Object>();
		try{
			if(categoryService.updateCategory(category)){
				map.put("MESSAGE", "UPDATE CATEGORY");
				map.put("STATUS", true);
			}else{
				map.put("MESSAGE", "NOT UPDATE CATEGORY");
				map.put("STATUS", false);
			}
		}catch(Exception e){
			map.put("MESSAGE", "Error!");
			map.put("STATUS", false);
			e.printStackTrace();
		}
		return new ResponseEntity<Map<String,Object>>(map , HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value="/{cat_id}" , method = RequestMethod.DELETE, headers="Accept=Application/json")
	public ResponseEntity<Map<String , Object>> deleteCategory(@PathVariable("cat_id") int cat_id){
		Map<String , Object> map = new HashMap<String,Object>();
		try{
			if(categoryService.deleteCategory(cat_id)){
				map.put("MESSAGE", "DELETE CATEGORY");
				map.put("STATUS" , true);
			}else{
				map.put("MESSAGE", "NOT DELETE CATEGORY");
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
