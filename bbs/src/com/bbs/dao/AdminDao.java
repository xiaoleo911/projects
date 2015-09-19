package com.bbs.dao;

import java.sql.*;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class AdminDao {
	
	
	public AdminDao() {
	}
	
	
	public String queryUser() throws SQLException{
		 ComboPooledDataSource ds = new ComboPooledDataSource("bbs");
		 Connection conn = ds.getConnection();
		 Statement stmt = conn.createStatement();
		 
		 String result = "false";
		 String sql = "SELECT * FROM admin";
		 ResultSet rs = stmt.executeQuery(sql);
		 while(rs.next()){
			 String name = rs.getString(2);
			 String password = rs.getString(3);
			 if((name.equals(name))&&(password.equals(password))){
				 result = "success";
			 }
		 }
		 conn.close();
		 return result;
		 
	}
	
}
