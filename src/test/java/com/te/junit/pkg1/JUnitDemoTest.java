package com.te.junit.pkg1;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class JUnitDemoTest {

	@Test
	void testInsert() {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=root&password=root@123");
	    JuiniJDBC jc = new JuiniJDBC();
	    jc.insert(1, "Hemadri");
//	     assertEquals(1, i);
	    String query = "select * from student";
	    Statement stmt = con.createStatement();
	   ResultSet rs= stmt.executeQuery(query);
	   assertEquals(1,rs.getInt(1));
	   assertEquals("Hemadri",rs.getString(2));
	   con.close();
	   
	} catch (Exception e) {
	e.getMessage();
	}
	}
	@Test
	void testUpdate() {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=root&password=root@123");
	    JuiniJDBC jc = new JuiniJDBC();
	    jc.update(1, "Hkr");
//	    assertEquals(1, i);
	    String query = "select * from student";
	    Statement stmt = con.createStatement();
	   ResultSet rs= stmt.executeQuery(query);
	   assertEquals("Hkr", rs.getString(2));
	   con.close();
	} catch (Exception e) {
	e.getMessage();
	}

	}

	@Test
	void testSelect() {
		JuiniJDBC jc = new JuiniJDBC();
	ArrayList<Object> obj=jc.select();
	assertEquals(obj!=null, false);
	}



	@Test
	void testDelete() {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?user=root&password=root@123");
	    JuiniJDBC jc = new JuiniJDBC();
	    jc.delete(1);
//	     assertEquals(1, i);
	    String query = "select * from student";
	    Statement stmt = con.createStatement();
	   ResultSet rs= stmt.executeQuery(query);
	   assertEquals(rs.next(), false);
	   con.close();
	} catch (Exception e) {
	e.getMessage();
	}
	}


}
