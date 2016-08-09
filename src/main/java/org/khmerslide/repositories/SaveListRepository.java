package org.khmerslide.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmerslide.entities.Save_List;
import org.springframework.stereotype.Repository;
@Repository
public interface SaveListRepository {
	/*  Status 
    	1 NOT DELETE
		2.DELETE
	 */
	String G_SL="SELECT"
			+" S.sl_id,"
			+" S.sl_name,"
			+" S.saved_date,"
			+" S.status,"
			+" U.user_name,"
			+" D.doc_title,"
			+" S.description"
			+" FROM"
			+" ksl_save_list S"
			+" INNER JOIN ksl_user U ON  S.user_id = U.user_id"
			+" INNER JOIN ksl_document D ON S.doc_id = D.doc_id"
			+" WHERE S.status = 1";
	@Select(G_SL)
	@Results(value={
			@Result(property="user.user_name",column="user_name"),
			@Result(property="doc.doc_name",column="doc_name")
	})
	public ArrayList<Save_List> getSaveList();
	String A_SL="INSERT INTO "
				+ "ksl_save_list("
				+ "sl_id,"
				+ "sl_name,"
				+ "saved_date,"
				+ "status,"
				+ "user_id,"
				+ "doc_id,"
				+ "description) "
				+ "VALUES("
				+ "#{sl_id},"
				+ "#{sl_name},"
				+ "#{saved_date},"
				+ "#{status},"
				+ "#{user.user_id},"
				+ "#{doc.doc_id},"
				+ "#{description})";
	@Insert(A_SL)
	@Results(value={
			@Result(property="user.user_id",column="user_id"),
			@Result(property="doc.doc_id",column="doc_id")
	})
	public boolean addSaveList(Save_List savelist);
	String U_SL="UPDATE ksl_save_list SET "
			+ "sl_name=#{sl_name},"
			+ "saved_date=#{saved_date},"
			+ "status=#{status},"
			+ "user_id=#{user.user_id},"
			+ "doc_id=#{doc.doc_id} "
			+ "WHERE "
			+ "sl_id=#{sl_id}";
	@Update(U_SL)
	public boolean updateSaveList(Save_List savelist);
	String D_SL="UPDATE ksl_save_list"
			+" SET"
			+" status=2"
			+" WHERE"
			+" sl_id=#{sl_id}";
	@Delete(D_SL)
	public boolean deleteSaveList(int savelist);
	

}
