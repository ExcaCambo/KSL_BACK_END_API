package org.khmerslide.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmerslide.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories {
	
	/*  Status 
	    1 active
		2.disactive
		3.delete
	*/
	String G_USER="SELECT"
				+" U.user_id,"
				+" U.user_name,"
				+" U.gender,"
				+" U.email,"
				+" U.password,"
				+" U.registered_date,"
				+" U.photo,"
				+" U.description,"
				+" U.status,"
				+" ut.role_name"
				+" FROM "
				+" ksl_user U"
				+" INNER JOIN ksl_user_type ut ON U.role_id = ut.role_id"
				+" WHERE U.status=1";
	@Select(G_USER)
	@Results(value={
			@Result(property="role.role_name", column="role_name")
	})
	public ArrayList<User> getUser();

	String A_USER="INSERT INTO"
					+" ksl_user("
					+" user_id,"
					+" user_name,"
					+" gender,"
					+" email,"
					+" password,"
					+" registered_date,"
					+" photo,"
					+" description,"
					+" status,"
					+" role_id) "
					+" VALUES("
					+" #{user_id},"
					+" #{user_name},"
					+" #{gender},"
					+" #{email},"
					+" #{password},"
					+" #{registered_date},"
					+" #{photo},"
					+" #{description},"
					+" #{status},"
					+" #{role.role_id})"; 
	@Insert(A_USER)
	public boolean addUser(User user);
	
	
	
	
	String UABA="UPDATE ksl_user "
			+ " SET"
			+ " status=#{status}"
			+ " WHERE stutus = 2 "
			+ " AND"
			+ " user_id =#{user_id}";
	@Update(UABA)
	public boolean setApproveByAdmin(int status);
	
	
	String U_USER="UPDATE ksl_user "
					+ "SET "
					+ "user_name=#{user_name},"
					+ "gender=#{gender},"
					+ "email=#{email},"
					+ "registered_date=#{registered_date},"
					+ "photo=#{photo},"
					+ "description=#{description},"
					+ "status=#{status},"
					+ "role_id=#{role.role_id} "
					+ "WHERE "
					+ "user_id=#{user_id}";
	@Update(U_USER)
	public boolean updateUser(User user);

	String D_USER="UPDATE ksl_user"
				 +" SET"
				 +" status=2"
				 +" WHERE"
				 +" user_id=#{id}";
	@Delete(D_USER)
	public boolean deleteUser(int id);

	
}