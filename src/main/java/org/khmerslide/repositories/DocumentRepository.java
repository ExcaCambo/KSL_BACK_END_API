package org.khmerslide.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmerslide.entities.Document;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository {
	String G_DOC="SELECT" 
			+" d.doc_id,"
			+" d.doc_title,"
			+" d.uploaded_date,"
			+" d.url,"
			+" d.liked,"
			+" d.shared,"
			+" d.viewed,"
			+" d.description,"
			+" d.status,"
			+" dt.doc_name,"
			+" u.user_name,"
			+" ct.cat_name,"
			+" d.thumbnail" 
			+" FROM" 
			+" ksl_document d"
			+" INNER JOIN ksl_doc_type dt ON d.doc_type_id = dt.doc_type_id"  
			+" INNER JOIN ksl_category ct ON d.cat_id = ct.cat_id"
			+" INNER JOIN ksl_user u ON d.user_id = u.user_id"
			+" WHERE"
			+" d.status = 1";
	@Select(G_DOC)
	@Results(value={
			@Result(property="doc.doc_name",column="doc_name"),
			@Result(property="user.user_name",column="user_name"),
			@Result(property="cat.cat_name",column="cat_name")
	})
	public ArrayList<Document> getDocument();
	
	String A_DOC="INSERT INTO "
				+ "ksl_document("
				+ "doc_id,"
				+ "doc_title,"
				+ "uploaded_date,"
				+ "url,"
				+ "liked,"
				+ "shared,"
				+ "viewed,"
				+ "description,"
				+ "status,"
				+ "doc_type_id,"
				+ "user_id,"
				+ "cat_id,"
				+ "thumbnail) "
				+ "VALUES("
				+ "#{doc_id},"
				+ "#{doc_title},"
				+ "#{uploaded_date},"
				+ "#{url},"
				+ "#{liked},"
				+ "#{shared},"
				+ "#{viewed},"
				+ "#{description},"
				+ "#{status},"
				+ "#{doc_type_id},"
				+ "#{user_id},"
				+ "#{cat_id},"
				+ "#{thumbnail})";
	
	@Insert(A_DOC)
	public boolean addDocument(Document doc);
	
	String U_DOC="UPDATE ksl_document "
			+ "SET "
			+ "doc_title=#{doc_title},"
			+ "uploaded_date=#{uploaded_date},"
			+ "url=#{url},"
			+ "liked=#{liked},"
			+ "shared=#{shared},"
			+ "viewed=#{viewed},"
			+ "description=#{description},"
			+ "status=#{status},"
			+ "doc_type_id=#{doc_type_id},"
			+ "user_id=#{user_id},"
			+ "cat_id=#{cat_id},"
			+ "thumbnail=#{thumbnail} "
			+ "WHERE "
			+ "doc_id=#{doc_id}";
	@Update(U_DOC)
	public boolean updateDocument(Document doc);
	
	String D_DOC="UPDATE ksl_document"
			+" SET"
			+" status=2"
			+" WHERE "
			+" doc_id=#{doc_id}";
	@Delete(D_DOC)
	public boolean deleteDocument(int doc_id);
}
