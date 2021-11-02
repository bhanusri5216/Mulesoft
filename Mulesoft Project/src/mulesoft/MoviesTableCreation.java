package mulesoft;
import java.sql.*;

public class MoviesTableCreation {
	public static void main(String args[]) {
	try {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","root");
		System.out.println("Connection Established");
		
		Statement stmt= con.createStatement();
		String qry = "create table Movies( Mname varchar(30) not null,Mactor varchar(30) not null,Mactress varchar(30) not null,Mdirector varchar(30) not null,Myear int not null)";
		stmt.executeUpdate(qry);
	}


	catch (Exception e) {
		System.out.println(e);
	}
}
}