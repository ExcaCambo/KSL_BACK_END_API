package org.khmerslide.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmerslide.entities.Category;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepository {
	String G_C="SELECT "
			+" CB.cat_id,"
			+" S.cat_name,"
			+" CB.cat_name,"
			+" CB.created_date,"
			+" CB.status,"
			+" U.user_name,"
			+" CB.description,"
			+" CB.icon"
			+" FROM  ksl_category S"
			+" INNER JOIN ksl_category CB ON S.cat_id = CB.parent_id"
			+" INNER JOIN ksl_user U ON S.user_id = U.user_id";
	@Select(G_C)
	@Results(value={
			@Result(property="user.user_name", column="user_name")
	})
	public ArrayList<Category> getCategory();
	
	
	String A_C="INSERT INTO "
			+ "ksl_category("
			+ "cat_id,"
			+ "parent_id,"
			+ "cat_name,"
			+ "created_date,"
			+ "status,"
			+ "user_id,"
			+ "description) "
			+ "VALUES("
			+ "#{cat_id},"
			+ "#{parent_id},"
			+ "#{cat_name},"
			+ "#{created_date},"
			+ "#{status},"
			+ "#{user_id},"
			+ "#{description})";
	@Insert(A_C)
	public boolean addCategory(Category category);
	
	String U_C="UPDATE ksl_category SET "
			+ "parent_id=#{parent_id},"
			+ "cat_name=#{cat_name},"
			+ "created_date=#{created_date},"
			+ "status=#{status},"
			+ "user_id=#{user_id},"
			+ "description=#{description} "
			+ "WHERE "
			+ "cat_id=#{cat_id}";
	@Update(U_C)
	public boolean updateCategory(Category category);
	
	String D_C="DELETE FROM ksl_category "
			+ "WHERE "
			+ "cat_id=#{cat_id}";
	@Delete(D_C)
	public boolean deleteCategory(int cat_id);
}
