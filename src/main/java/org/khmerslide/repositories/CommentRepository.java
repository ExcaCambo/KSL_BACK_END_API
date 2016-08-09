package org.khmerslide.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmerslide.entities.Comment;
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
			+" INNER JOIN ksl_user U ON C.user_id = U.user_id"
			+" INNER JOIN ksl_document D ON C.doc_id = D.doc_id"
			+" WHERE C.status = 1 ";
	@Select(G_CM)
	@Results(value={
			@Result(property="user.user_name",column="user_name"),
			@Result(property="doc.doc_title",column="doc_title")
	})
	public ArrayList<Comment> getComment();
	String A_CM="INSERT INTO "
			+ "ksl_comment("
			+ "cmt_id,"
			+ "cmt_text,"
			+ "cmt_date,"
			+ "status,"
			+ "user_id,"
			+ "doc_id) "
			+ "VALUES("
			+ "#{cmt_id},"
			+ "#{cmt_text},"
			+ "#{cmt_date},"
			+ "#{status},"
			+ "#{user_id},"
			+ "#{doc_id})";
	@Insert(A_CM)
	public boolean addComment(Comment comment);
	
	String U_CM="UPDATE ksl_comment SET "
			+ "cmt_text=#{cmt_text},"
			+ "cmt_date=#{cmt_date},"
			+ "status=#{status},"
			+ "user_id=#{user_id},"
			+ "doc_id=#{doc_id} "
			+ "WHERE "
			+ "cmt_id=#{cmt_id}";
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
