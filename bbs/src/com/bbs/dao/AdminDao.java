package com.bbs.dao;

import java.sql.*;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.junit.Test;

import com.bbs.entities.Admin;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class AdminDao {
	
	
	public void insertUser(String name, String password) throws SQLException {


		ComboPooledDataSource ds = new ComboPooledDataSource("bbs");
		Connection conn = ds.getConnection();
		
		String sql = "INSERT admin(name,password) VALUES(?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);

		try {
			
			
			ps.setString(1, name);
			ps.setString(2, password); 
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (conn != null)
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
		}

	}
	
	public Admin queryUser(String name, String password) throws SQLException {

		Admin admin = new Admin();

		ComboPooledDataSource ds = new ComboPooledDataSource("bbs");
		Connection conn = ds.getConnection();
		
		String sql = "SELECT * FROM admin WHERE NAME=? AND PASSWORD=?;";
		PreparedStatement st = conn.prepareStatement(sql);

		try {

			st.setString(1, name);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			while(rs.next()){ 
				   admin.setName(rs.getString(2));
				   admin.setPassword(rs.getString(3));
				} 
			
			if(rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (conn != null)
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
		}
		return admin;

	}

	public AdminDao() {

	}
}
