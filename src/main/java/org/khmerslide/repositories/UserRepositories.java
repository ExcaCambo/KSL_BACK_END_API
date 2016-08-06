package org.khmerslide.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmerslide.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories {
	String G_USER="SELECT "
				+"U.user_id,"
				+"U.user_name,"
				+"U.gender,"
				+"U.email,"
				+"U.password,"
				+"U.registered_date,"
				+"U.photo,"
				+"U.description,"
				+"U.status,"
				+"U.role_id "
				+"FROM "
				+"ksl_user U "
				+"INNER JOIN ksl_user_type ut ON U.role_id = ut.role_id";
	@Select(G_USER)
	public ArrayList<User> getUser();
	
	String A_USER="INSERT INTO "
					+ "ksl_user("
					+ "user_id,"
					+ "user_name,"
					+ "gender,"
					+ "email,"
					+ "password,"
					+ "registered_date,"
					+ "photo,"
					+ "description,"
					+ "status,"
					+ "role_id) "
					+ "VALUES("
					+ "#{user_id},"
					+ "#{user_name},"
					+ "#{gender},"
					+ "#{email},"
					+ "#{password},"
					+ "#{registered_date},"
					+ "#{photo},"
					+ "#{description},"
					+ "#{status},"
					+ "#{role_id.role_id})"; 
	@Insert(A_USER)
	public boolean addUser(User user);

	String U_USER="UPDATE ksl_user "
					+ "SET "
					+ "user_name=#{user_name},"
					+ "gender=#{gender},"
					+ "email=#{email},"
					+ "registered_date=#{registered_date},"
					+ "photo=#{photo},"
					+ "description=#{description},"
					+ "status=#{status},"
					+ "role_id=#{role_id.role_id} "
					+ "WHERE "
					+ "user_id=#{user_id}";
	@Update(U_USER)
	public boolean updateUser(User user);

	String D_USER="DELETE FROM "
					+ "ksl_user "
					+ "WHERE "
					+ "user_id=#{id}";
	@Delete(D_USER)
	public boolean deleteUser(int id);

	
}