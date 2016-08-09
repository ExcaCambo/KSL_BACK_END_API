package org.khmerslide.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.khmerslide.entities.Category;
import org.khmerslide.entities.Doc_Type;
import org.khmerslide.entities.Document;
import org.khmerslide.entities.User;
import org.khmerslide.model.InputDocument;
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
@RequestMapping(value="/api/docs")
public class DocumentController {
		
	@Autowired
	private DocumentService documentService;
	
	@ResponseBody
	@RequestMapping(value={"/get-document"},method=RequestMethod.GET,headers="Accept=Application/json")
	public ResponseEntity<Map<String, Object>> getDocument(){
		Map<String , Object> map = new HashMap<String , Object>();
		try{
			ArrayList<Document> docs = documentService.getDocument();
			if(!docs.isEmpty()){
				map.put("DATA", docs);
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
	
	@RequestMapping(value={"/add-ducument"},method = RequestMethod.POST, headers="Accept=Application/json")
	public ResponseEntity<Map<String , Object>> addDocument(@RequestBody InputDocument document){
		Map<String,Object> map = new HashMap<String, Object>();
		try{
			Document doc = new Document();
			doc.setDoc_id(document.getDoc_id());
			doc.setDoc_title(document.getDoc_title());
			doc.setUploaded_date(document.getUploaded_date());
			doc.setUrl(document.getUrl());
			doc.setLiked(document.getLiked());
			doc.setShared(document.getShared());
			doc.setViewed(document.getViewed());
			doc.setDescription(document.getDescription());
			doc.setStatus(document.getStatus());
			Doc_Type dt = new Doc_Type();
				dt.setDoc_type(document.getDoc_id());
			doc.setDoc(dt);
			User u = new User();
				u.setUser_id(document.getUser_id());
			doc.setUser(u);
			Category  c = new Category();
				c.setCat_id(document.getCat_id());
			doc.setCat(c);
			doc.setThumbnail(document.getThumbnail());
			doc.setSource(document.getSource());
			
			if(documentService.addDocument(doc)){
				map.put("MESSAGE", "ADD DOCUMENT");
				map.put("STATUS", true);
			}else{
				map.put("MESSAGE", "NOT ADD DOCUMENT");
				map.put("STATUS", false);
			}
		}catch(Exception e){
			map.put("MESSAGE", "Error!");
			map.put("STATUS", false);
			e.printStackTrace();
		}
		return new ResponseEntity<Map<String,Object>>(map , HttpStatus.OK);
		
	}
	
	@RequestMapping(value={"/update-document"},method=RequestMethod.PUT, headers = "Accept=Application/json")
	public ResponseEntity<Map<String, Object>> updateDocument(@RequestBody Document document){
		Map<String, Object> map = new HashMap<String , Object>();
		try{
			if(documentService.updateDocument(document)){
				map.put("MESSAGE", "UPDATE DOCUMENT");
				map.put("STATUS", true);
			}else{
				map.put("MESSAGE", "NOT UPDATE DOCUMENT");
				map.put("STATUS", false);
			}
		}catch(Exception e){
			map.put("MESSAGE", "Error!");
			map.put("STATUS", false);
			e.printStackTrace();
		}
		return new ResponseEntity<Map<String,Object>>(map , HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value="/delete-document/{doc_id}" , method = RequestMethod.DELETE, headers="Accept=Application/json")
	public ResponseEntity<Map<String , Object>> deleteUser(@PathVariable("doc_id") int doc_id){
		Map<String , Object> map = new HashMap<String,Object>();
		try{
			if(documentService.deleteDocument(doc_id)){
				map.put("MESSAGE", "DOCUMENT DELETE");
				map.put("STATUS" , true);
			}else{
				map.put("MESSAGE", "DOCUMENT NOT DELETE");
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
