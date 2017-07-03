package com.bookapp.model;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       User user=new User();
       user.setId(1);
       user.setName("day");
       user.setEmailId("dh13@gmail.com");
       user.setPassword("12");
       user.setActive(1);
       System.out.println(user.getId());
       System.out.println(user.getName());
       System.out.println(user.getEmailId());
       System.out.println(user.getPassword());
       System.out.println(user.getActive());
       System.out.println(user);
	}

}
