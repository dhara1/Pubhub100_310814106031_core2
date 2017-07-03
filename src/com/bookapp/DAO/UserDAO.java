package com.bookapp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bookapp.model.User;
import com.bookapp.util.ConnectionUtil;

public class UserDAO {
    public void register(User user) throws Exception{
    	Connection connection=ConnectionUtil.getConnection();
    	PreparedStatement pst=connection.prepareStatement("INSERT INTO users (NAME,email_id,PASSWORD,active) VALUES (?,?,?,?)");
    	pst.setString(1,user.getName());
    	pst.setString(1,user.getEmailId());
    	pst.setString(1,user.getPassword());
    	pst.setInt(1,user.getActive());
    	pst.executeUpdate();
    }   
}
