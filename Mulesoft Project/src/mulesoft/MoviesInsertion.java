package mulesoft;

import java.sql.*;
import java.util.Scanner;

public class MoviesInsertion {
	public static void main(String args[]) {
		try {
			
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","root");
			System.out.println("Connection Established");
			int Myear;
			String Mname=null;
			String Mactor=null;
			String Mactress=null;
			String Mdirector=null;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Movie Name Name");
			Mname=sc.next();
			System.out.println("Enter Movie Actor Name");
			Mactor=sc.next();
			System.out.println("Enter Movie Actress Name");
			Mactress=sc.next();
			System.out.println("Enter Movie Director Name");
			Mdirector=sc.next();
			System.out.println("Enter Movie Released Year");
			Myear=sc.nextInt();
			
			PreparedStatement pstmt= con.prepareStatement("insert into Movies values(?,?,?,?,?)");
			pstmt.setString(1,Mname);
			pstmt.setString(2,Mactor);
			pstmt.setString(3,Mactress);
			pstmt.setString(4,Mdirector);
			pstmt.setInt(5,Myear);
			pstmt.execute();
			System.out.println("Inserted Successfully");
		}


		catch (Exception e) {
			System.out.println(e);
		}
	}
}
