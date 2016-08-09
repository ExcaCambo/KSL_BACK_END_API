package org.khmerslide.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmerslide.entities.View_History;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewHistoryRepository {
	/*  Status 
    1 active
	2.disactive
	3.delete
	 */
	String G_VH="SELECT "
			+ "vh_id,"
			+ "added_date,"
			+ "user_id,"
			+ "doc_id,"
			+ "description "
			+ "FROM "
			+ "ksl_view_history";
	@Select(G_VH)
	public ArrayList<View_History> getViewHistory();
	
	String A_VH="INSERT INTO "
			+ "ksl_view_history("
			+ "vh_id,"
			+ "added_date,"
			+ "user_id,"
			+ "doc_id,"
			+ "description) "
			+ "VALUES("
			+ "#{vh_id},"
			+ "#{added_date},"
			+ "#{user_id},"
			+ "#{doc_id},"
			+ "#{description})";
	@Insert(A_VH)
	public boolean addViewHistory(View_History vh);
	
	String U_VH="UPDATE ksl_view_history SET "
			+ "added_date=#{added_date},"
			+ "user_id=#{user_id},"
			+ "doc_id=#{doc_id},"
			+ "description=#{description} "
			+ "WHERE "
			+ "vh_id=#{vh_id}";
	@Update(U_VH)
	public boolean updateViewHistory(View_History vh);
	
	String D_VH="DELETE FROM ksl_view_history "
			+ "WHERE "
			+ "vh_id=#{vh_id}";
	@Delete(D_VH)
	public boolean deleteViewHistory(int vh_id);
}
