package com.te.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		Connection connection = null;
		Statement stmt = null;
		 try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "kittu");
			stmt = connection.createStatement();
			stmt.execute("insert into employees values (104, 'samantha')");
			stmt.execute("updates employees set name ='dhananjay' where id=101");
			stmt.execute("insert into employees values (103, 'ManjuTheBoss')");
			stmt.execute("delete from employees where id = 103");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
