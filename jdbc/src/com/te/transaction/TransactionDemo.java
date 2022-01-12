package com.te.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {

		Connection connection = null;
		Statement stmt = null;
		Savepoint setSavepoint = null;
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		try {

			connection = DriverManager.getConnection("url", "root", "kittu");
			stmt = connection.createStatement();
			connection.setAutoCommit(false);
			stmt.execute("insert into trans values(1,'Unlocking by fingerprint')");
			stmt.execute("insert into trans values(2,'Entering the pin')");
			stmt.execute("insert into trans values(3,'Check balance')");
			System.out.println("Balance is 100000000");

			setSavepoint = connection.setSavepoint();

			stmt.execute("insert into trans values(4,'debiting the amount')");
			stmt.execute("insert into trans values(5,'Transfer through network')");
			stmt.execute("insert into trans values(6,'Crediting the amount')");
			System.out.println("Transaction completed!! Tinding!!");
			connection.commit();
		} catch (SQLException e) {

			try {
				connection.rollback(setSavepoint);
				connection.commit();
			} catch (SQLException e1) {

			}
			System.out.println("Transaction failed!");
		}

	}
   
}
