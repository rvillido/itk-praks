package ee.itcollege.i377.praktikum3.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ee.itcollege.i377.praktikum3.model.Guard;

public class GuardDao {
	
	public List<Guard> getGuards() throws Exception {
	    List<Guard> rv = new ArrayList<Guard>();
	    Class.forName("org.hsqldb.jdbcDriver");
	    Connection conn = DriverManager.getConnection("jdbc:hsqldb:C:/Projects/Java praks/HSQL/BorderDB");
	    Statement s = conn.createStatement();
	    ResultSet rs = s.executeQuery("SELECT id, name, age FROM guard");
	    while(rs.next()) {
	        Guard g = new Guard();
	        g.setId(rs.getInt(1));
	        g.setName(rs.getString(2));
	        g.setAge(rs.getInt(3));
	        rv.add(g);
	    }

	    return rv;
	}

}
