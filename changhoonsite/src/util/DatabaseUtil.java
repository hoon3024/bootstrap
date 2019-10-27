package util;

import java.sql.DriverManager;

import java.sql.Connection;

public class DatabaseUtil {	
	
	public static Connection getConnection(){
		try{
			String dbURL = "jdbc:mysql://localhost:3306?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false/changhoon";
			String dbID = "root";
			String dbPassword = "dlckdgns1";
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(dbURL, dbID, dbPassword);
			
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
		
		
	}

}
