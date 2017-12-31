package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ThemCauTraLoiDAO {
	public void ThemCauTraLoi(String AnswerContent, int QuestionId, int IsTrue) throws SQLException {
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=OnlineTest;user=user;password=123";
		Connection conn=null;
		PreparedStatement cstmt=null;
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return;
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			int t=1;
			String sql= "{call dbo.spThemCauTraLoi(?,?,?)}";
			cstmt=conn.prepareStatement(sql);
	
			cstmt.setString(1,AnswerContent);
			cstmt.setInt(2,QuestionId);		
			cstmt.setInt(3,IsTrue);	
			int temp = cstmt.executeUpdate();
			
			cstmt.close();
			conn.close();
	}
}
