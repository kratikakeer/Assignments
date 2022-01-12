package com.te.storedprocessor;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		Connection connection = null;
		CallableStatement callStatement = null;
		
		try {
			connection =  DriverManager.getConnection(url,"root","kittu");
			callStatement = connection.prepareCall("call put(?,?,?,?)");
			//taking  the inputs from the user
			Scanner scan = new Scanner(System.in);
			while(true) {
				System.out.println("Enter the id of the sweet");
				int id = scan.nextInt();
				if(id == 0) {
					break;
				}
				System.out.println("Enter the name of the sweet");
				String name = scan.next();
				System.out.println("Enter the cost of the sweet");
				double price = scan.nextDouble();
				System.out.println("Enter the quantity of the sweet");
				int kg = scan.nextInt();
				
				//Assigning the values to table
				callStatement.setInt(1,id);
				callStatement.setString(2, name);
				callStatement.setDouble(3, price);
				callStatement.setInt(4, kg);
				
				//Execute the statement
				callStatement.execute();
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
