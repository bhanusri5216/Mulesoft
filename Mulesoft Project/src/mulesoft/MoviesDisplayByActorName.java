package mulesoft;
import java.sql.*;
import java.util.Scanner;

public class MoviesDisplayByActorName {
	public static void main(String args[]) {
	try {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","root");
		System.out.println("Connection Established");
		
		String Mactor=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Movie Actor Name");
		Mactor=sc.next();
		
		Statement stmt= con.createStatement();
		String qry = "SELECT * FROM movies WHERE Mactor= 'Prabhas' ";
		ResultSet rs=stmt.executeQuery(qry);
		int count=1;
		while(rs.next()) {
			System.out.println("Movies "+count);
			System.out.println("Movie Name "+rs.getString(1));
			System.out.println("Movie Actor "+rs.getString(2));
			System.out.println("Movie Actress "+rs.getString(3));
			System.out.println("Movie Director "+rs.getString(4));
			System.out.println("Movie Year "+rs.getInt(5));
			count=count+1;
		}
	}


	catch (Exception e) {
		System.out.println(e);
	}
}
}