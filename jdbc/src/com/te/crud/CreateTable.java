package com.te.crud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class CreateTable {
	public static void main(String[] args) {

		Connection connection = null;
		Statement createStatement = null;

		try {
			// load driver class
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// create a connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=kittu");

			// create a platform
			createStatement = connection.createStatement();

			// execute query
			createStatement.execute("create table sweets (id int, name varchar(40), cost double, quantity int)");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (createStatement != null) {
					try {
						createStatement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

}
