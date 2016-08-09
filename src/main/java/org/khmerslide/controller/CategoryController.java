package org.khmerslide.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmerslide.entities.Category;
import org.khmerslide.entities.User;
import org.khmerslide.model.InputCategory;
import org.khmerslide.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//rtfghgfjhukohuihkldsjfklsdfj
@Controller
@RequestMapping(value="/api/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@ResponseBody
	@RequestMapping(value={"/get-category"},method=RequestMethod.GET,headers="Accept=Application/json")
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
	
	
	@RequestMapping(value={"/add-category"},method = RequestMethod.POST, headers="Accept=Application/json")
	public ResponseEntity<Map<String , Object>> addCategory(@RequestBody InputCategory.InsertCategory inputcategory){
		Map<String,Object> map = new HashMap<String, Object>();
		try{
			Category cat = new Category();
			cat.setCat_id(inputcategory.getCat_id());
			Category parentCategory = new Category();
			
			parentCategory.setCat_id(inputcategory.getParent_id());
			
			cat.setParent(parentCategory);
			cat.setCat_name(inputcategory.getCat_name());
			cat.setCreated_date(inputcategory.getCreated_date());
			cat.setStatus(inputcategory.getStatus());
			
			User u = new User();
			u.setUser_id(inputcategory.getUser_id());
			
			cat.setUser(u);
			cat.setDescription(inputcategory.getDescription());
			cat.setIcon(inputcategory.getIcon());
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
	
	@RequestMapping(value={"/update-category/{cat_id}"},method=RequestMethod.PUT, headers = "Accept=Application/json")
	public ResponseEntity<Map<String, Object>> updateCategory(@PathVariable("cat_id") int cat_id,@RequestBody InputCategory.UpdateCategory updateCategory){
		Map<String, Object> map = new HashMap<String , Object>();
		try{
			Category  cat = new Category();
			cat.setCat_id(cat_id);
			cat.setCat_name(updateCategory.getCat_name());
				Category parentCategory = new Category();
				parentCategory.setCat_id(updateCategory.getParent_id());
			cat.setParent(parentCategory);
			
			if(categoryService.updateCategory(cat)){
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
	
	
	
	@RequestMapping(value={"/delete-category/{cat_id}"}, method = RequestMethod.DELETE, headers="Accept=Application/json")
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
