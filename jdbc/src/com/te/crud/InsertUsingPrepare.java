*package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUsingPrepare {
	
		public static void main(String[] args) {
			Connection connection = null;
			PreparedStatement statement = null;
			try {
			
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "kittu");
				statement = connection.prepareStatement("insert into sweets values(?,?,?,?)");
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the id of sweet");
				int id = scan.nextInt();
				System.out.println("Enter the name of sweet");
				String sweetname = scan.next();
				statement.setInt(1, id);
				statement.setString(2, sweetname);
				statement.setDouble(3, 50);
				statement.setInt(4, 1);
				int executeUpdate = statement.executeUpdate();
				System.out.println(executeUpdate);
				
				} catch(SQLException e) {
					e.printStackTrace();
				}
					
				}

}
