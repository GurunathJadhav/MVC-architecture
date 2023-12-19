package com.web_app_5.model;
import java.sql.*;

public class DAOServiceImp implements DAOService {
	private Connection con;
	private Statement smt;
	@Override
	public boolean connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginverifier","root","guru8296jadhav@");
			smt=con.createStatement();
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}

	@Override
	public boolean loginVerify(String username, String password) {
		try {
			ResultSet result = smt.executeQuery("select * from login_user where username='"+username+"' and password='"+password+"'");
			if(result.next()) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
