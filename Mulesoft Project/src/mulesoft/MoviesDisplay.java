package mulesoft;
import java.sql.*;

public class MoviesDisplay {
	public static void main(String args[]) {
	try {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","root");
		System.out.println("Connection Established");
		
		PreparedStatement pstmt= con.prepareStatement("select * from movies");
		ResultSet rs=pstmt.executeQuery();
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