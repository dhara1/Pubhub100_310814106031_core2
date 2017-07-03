package com.bookapp.DAO;

import com.bookapp.model.User;

public class TestUserDAO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		User user=new User();
	       
	       user.setName("dayy");
	       user.setEmailId("dh213@gmail.com");
	       user.setPassword("132");
	       user.setActive(1);
	       UserDAO dao=new UserDAO();
	       dao.register(user);
	}

}
