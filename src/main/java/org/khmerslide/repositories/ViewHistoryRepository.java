package org.khmerslide.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmerslide.entities.View_History;
import org.khmerslide.utilities.Pagination;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewHistoryRepository {
	/*  Status 
    1 active
	2.disactive
	3.delete
	 */
	String G_VH="SELECT" 
			+" VH.vh_id,"
			+" VH.added_date,"
			+" U.user_name,"
			+" D.doc_title,"
			+" VH.description,"
			+" VH.status"
			+" FROM"
			+" ksl_view_history VH"
			+" INNER JOIN ksl_user U ON VH.user_id = U.user_id"
			+" INNER JOIN ksl_document D ON VH.doc_id = D.doc_id"
			+" LIMIT #{pagination.limit}"
			+" OFFSET #{pagination.offset}";
	@Select(G_VH)
	@Results(value={
			@Result(property="user.user_name",column="user_name"),
			@Result(property="doc.doc_title",column="doc_title")
	})
	public ArrayList<View_History> getViewHistory(@Param("pagination") Pagination pagination);
	
	String G_VHBI="SELECT" 
			+" VH.vh_id,"
			+" VH.added_date,"
			+" U.user_name,"
			+" D.doc_title,"
			+" VH.description,"
			+" VH.status"
			+" FROM"
			+" ksl_view_history VH"
			+" INNER JOIN ksl_user U ON VH.user_id = U.user_id"
			+" INNER JOIN ksl_document D ON VH.doc_id = D.doc_id"
			+" WHERE"
			+" VH.vh_id=#{id}";
	@Select(G_VHBI)
	@Results(value={
			@Result(property="user.user_name",column="user_name"),
			@Result(property="doc.doc_title",column="doc_title")
	})
	public ArrayList<View_History> getViewHistoryById(int id);
	
	String A_VH="INSERT INTO"
			+" ksl_view_history("
			+" added_date,"
			+" user_id,"
			+" doc_id,"
			+" description,"
			+" status)"
			+" VALUES("
			+" #{added_date},"
			+" #{user.user_id},"
			+" #{doc.doc_id},"
			+" #{description},"
			+" #{status})";
	@Insert(A_VH)
	@Results(value={
			@Result(property="user.user_id",column="user_id"),
			@Result(property="doc.doc_id",column="doc_id")
	})
	public boolean addViewHistory(View_History vh);
	
	String U_VH="UPDATE ksl_view_history SET "
			+" doc_id=#{doc.doc_id},"
			+" description=#{description},"
			+" status=#{status}"
			+" WHERE"
			+" vh_id=#{vh_id}";
	@Update(U_VH)
	public boolean updateViewHistory(View_History vh);
	
	String D_VH="UPDATE ksl_view_history SET"
			+" status=2"
			+" vh_id=#{vh_id}";
	@Delete(D_VH)
	public boolean deleteViewHistory(int vh_id);
}
