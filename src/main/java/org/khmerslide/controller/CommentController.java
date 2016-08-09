package org.khmerslide.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmerslide.entities.Category;
import org.khmerslide.entities.Comment;
import org.khmerslide.entities.Document;
import org.khmerslide.entities.User;
import org.khmerslide.model.InputCategory;
import org.khmerslide.model.InputComment;
import org.khmerslide.services.CommentService;
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
@RequestMapping(value="/api/comment")
public class CommentController {
	@Autowired
	private CommentService commentService;
	@ResponseBody
	@RequestMapping(value={"/get-comment"},method=RequestMethod.GET,headers="Accept=Application/json")
	public ResponseEntity<Map<String, Object>> getComment(){
		Map<String , Object> map = new HashMap<String , Object>();
		try{
			ArrayList<Comment> comment = commentService.getComment();
			if(!comment.isEmpty()){
				map.put("DATA", comment);
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
	
	
	@RequestMapping(value={"/add-comment"},method = RequestMethod.POST, headers="Accept=Application/json")
	public @ResponseBody ResponseEntity<Map<String , Object>> addComment(@RequestBody InputComment insertcomment){
		Map<String,Object> map = new HashMap<String, Object>();
		try{
			Comment com = new Comment();
			com.setCmt_text(insertcomment.getCmt_text());
			com.setCmt_date(insertcomment.getCmt_date());
			com.setStatus(insertcomment.getStatus());
			 	User  u = new User();
			 		u.setUser_id(u.getUser_id());
			com.setUser(u);
				Document d = new Document();
				d.setDoc_id(d.getDoc_id());
			com.setDoc(d);
			com.setDescription(insertcomment.getDescription());
			if(commentService.addComment(com)){
				map.put("MESSAGE", "ADD COMMENT");
				map.put("STATUS", true);
			}else{
				map.put("MESSAGE", "NOT ADD COMMENT");
				map.put("STATUS", false);
			}
		}catch(Exception e){
			map.put("MESSAGE", "Error!");
			map.put("STATUS", false);
			e.printStackTrace();
		}
		return new ResponseEntity<Map<String,Object>>(map , HttpStatus.OK);
		
	}
	
	@RequestMapping(value={"/update-comment/{cmt_id}"},method=RequestMethod.PUT, headers = "Accept=Application/json")
	public ResponseEntity<Map<String, Object>> updateComment(@PathVariable("cmt_id") int cmt_id ,@RequestBody InputComment updatecomment){
		Map<String, Object> map = new HashMap<String , Object>();
		try{
				Comment C = new Comment();
				C.setCmt_id(cmt_id); //set cmt_id
				C.setCmt_text(updatecomment.getCmt_text());
				//user can comment only text
			if(commentService.updateComment(C)){
				map.put("MESSAGE", "UPDATE COMMENT");
				map.put("STATUS", true);
			}else{
				map.put("MESSAGE", "NOT UPDATE COMMENT");
				map.put("STATUS", false);
			}
		}catch(Exception e){
			map.put("MESSAGE", "Error!");
			map.put("STATUS", false);
			e.printStackTrace();
		}
		return new ResponseEntity<Map<String,Object>>(map , HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value="delete-comment/{cmt_id}" , method = RequestMethod.DELETE, headers="Accept=Application/json")
	public ResponseEntity<Map<String , Object>> deleteCategory(@PathVariable("cmt_id") int cmt_id){
		Map<String , Object> map = new HashMap<String,Object>();
		try{
			if(commentService.deleteComment(cmt_id)){
				map.put("MESSAGE", "DELETE COMMENT");
				map.put("STATUS" , true);
			}else{
				map.put("MESSAGE", "NOT DELETE COMMENT");
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
