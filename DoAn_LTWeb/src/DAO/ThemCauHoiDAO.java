package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.CauTraLoi;

public class ThemCauHoiDAO {
	public void ThemCauHoi(String QuestionContent,int KindId) throws SQLException {
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
			String sql= "{call dbo.spThemCauHoi(?,?)}";
			cstmt=conn.prepareStatement(sql);
	
			cstmt.setString(1,QuestionContent);
			cstmt.setInt(2,KindId);				
			int temp = cstmt.executeUpdate();
			
			cstmt.close();
			conn.close();
	}
}
