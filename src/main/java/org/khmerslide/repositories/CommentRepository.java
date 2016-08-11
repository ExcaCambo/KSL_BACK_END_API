package org.khmerslide.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmerslide.entities.Comment;
import org.khmerslide.utilities.Pagination;
import org.springframework.stereotype.Repository;

import scala.sys.process.processInternal;

@Repository
public interface CommentRepository {
	/*Status 
	    1 Not Active
		2.delete
	 */
	String G_CM="SELECT" 
			+" C.cmt_id,"
			+" C.cmt_text,"
			+" C.cmt_date,"
			+" C.status,"
			+" U.user_name,"
			+" D.doc_title" 
			+" FROM" 
			+" ksl_comment C"
			+" FULL JOIN ksl_user U ON C.user_id = U.user_id"
			+" FULL JOIN ksl_document D ON C.doc_id = D.doc_id"
			+" WHERE C.status = 1"
			+" LIMIT #{pagination.limit}"
			+" OFFSET #{pagination.offset}";
	@Select(G_CM)
	@Results(value={
			@Result(property="user.user_name",column="user_name"),
			@Result(property="doc.doc_title",column="doc_title")
	})
	public ArrayList<Comment> getComment(@Param("pagination") Pagination pagination);
	
	
	String G_CMBI="SELECT" 
			+" C.cmt_id,"
			+" C.cmt_text,"
			+" C.cmt_date,"
			+" C.status,"
			+" U.user_name,"
			+" D.doc_title" 
			+" FROM" 
			+" ksl_comment C"
			+" FULL JOIN ksl_user U ON C.user_id = U.user_id"
			+" FULL JOIN ksl_document D ON C.doc_id = D.doc_id"
			+" WHERE C.status = 1"
			+" AND"
			+" C.cmt_id=#{id};";
	@Select(G_CMBI)
	@Results(value={
			@Result(property="user.user_name",column="user_name"),
			@Result(property="doc.doc_title",column="doc_title")
	})
	public ArrayList<Comment> getCommentById(int id);
	
	String A_CM="INSERT INTO "
			+ "ksl_comment("
			+ "cmt_text,"
			+ "cmt_date,"
			+ "status,"
			+ "user_id,"
			+ "doc_id,"
			+ "description)"
			+ "VALUES("
			+ "#{cmt_text},"
			+ "#{cmt_date},"
			+ "#{status},"
			+ "#{user.user_id},"
			+ "#{doc.doc_id},"
			+ "#{description})";
	@Insert(A_CM)
	@Results(value={
			@Result(property="user.user_id",column="user_id"),
			@Result(property="doc.doc_id",column="doc_id")
	})
	public boolean addComment(Comment comment);
	
	String U_CM="UPDATE ksl_comment"
			+" SET"
			+" cmt_text=#{cmt_text}"
			+" WHERE"
			+" cmt_id=#{cmt_id}";
	@Update(U_CM)
	public boolean updateComment(Comment comment);
	
	String D_CM="UPDATE ksl_comment"
			+" SET"
			+" status=2"
			+" WHERE"
			+" cmt_id=#{cmt_id}";
	@Delete(D_CM)
	public boolean deleteComment(int cmt_id);
}
