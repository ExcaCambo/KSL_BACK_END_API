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
	String G_DOC="SELECT "
				+"d.doc_id,"
				+"d.doc_title,"
				+"d.uploaded_date,"
				+"d.url,"
				+"d.liked,"
				+"d.shared,"
				+"d.viewed,"
				+"d.description,"
				+"d.status,"
				+"d.doc_type_id,"
				+"d.user_id,"
				+"d.cat_id,"
				+"d.thumbnail "
				+"FROM "
				+"ksl_document d "
				+"INNER JOIN ksl_doc_type dt ON d.doc_type_id = dt.doc_type_id " 
				+"INNER JOIN ksl_category ct ON d.cat_id = ct.cat_id "
				+"INNER JOIN ksl_user u ON d.user_id = u.user_id";
	@Select(G_DOC)
	@Results(value={
			@Result(property="doc_id",column="doc_id"),
			@Result(property="doc_title",column="doc_title"),
			@Result(property="uploaded_date",column="uploaded_date"),
			@Result(property="url",column="url"),
			@Result(property="liked",column="liked"),
			@Result(property="shared",column="shared"),
			@Result(property="viewed",column="viewed"),
			@Result(property="description",column="description"),
			@Result(property="status",column="status"),
			@Result(property="doc_type_id",column="doc_type_id"),
			@Result(property="user_id",column="user_id"),
			@Result(property="cat_id",column="cat_id"),
			@Result(property="thumbnail",column="thumbnail")
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
	
	String D_DOC="DELETE FROM "
			+ "ksl_document "
			+ "WHERE "
			+ "doc_id=#{doc_id}";
	@Delete(D_DOC)
	public boolean deleteDocument(int doc_id);
}
