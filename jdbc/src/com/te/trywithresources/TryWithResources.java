package com.te.trywithresources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResources {
	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=kittu");
				Statement stmt = con.createStatement();) {
			boolean execute = stmt.execute("alter table sweets rename to champa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
