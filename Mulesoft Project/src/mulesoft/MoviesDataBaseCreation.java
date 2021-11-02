package mulesoft;
import java.sql.*;

public class MoviesDataBaseCreation {
	public static void main(String args[]) {
		
	
try {
	Connection con = null;
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver Loaded Successfully");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
	System.out.println("Connection Established");
	
	Statement stmt=con.createStatement();
	String qry = "create database Movies";
	stmt.executeUpdate(qry);
}


catch (Exception e) {
	System.out.println(e);
}
}
}	
