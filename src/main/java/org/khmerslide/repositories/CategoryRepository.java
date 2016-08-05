package org.khmerslide.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmerslide.entities.Category;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepository {
	String G_C="SELECT "
			+ "cat_id,"
			+ "parent_id,"
			+ "cat_name,"
			+ "created_date,"
			+ "status,"
			+ "user_id,"
			+ "description "
			+ "FROM "
			+ "ksl_category";
	@Select(G_C)
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
