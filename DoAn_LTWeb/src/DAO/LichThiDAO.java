package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.LichThi;

public class LichThiDAO {
	public static List<LichThi> getLichThi(int Uid) throws SQLException
	{
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=OnlineTest;user=user;password=123";
		Connection conn=null;
		CallableStatement cstmt=null;
		int UserId, SubjectId, TestId, Time_Test, InTest;
		String Time_Start, Time_Close, TestName,Date;
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return null;
	        } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String sql= "{call dbo.spLichThi(?)}";
			cstmt=conn.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			cstmt.setInt(1, Uid);
			
			ResultSet kq=cstmt.executeQuery();
			
			List<LichThi> LichThi= new ArrayList<LichThi>();
			while(kq.next()) {
				UserId = kq.getInt("UserId");
				SubjectId = kq.getInt("SubjectId");
				TestId = kq.getInt("TestId");
				Time_Test = kq.getInt("Time_Test");
				Time_Start = kq.getString("TimeStart");
				Time_Close = kq.getString("TimeClose");
				TestName = kq.getString("TestName");
				Date = kq.getString("Date");
				InTest = kq.getInt("InTest");
				LichThi.add(new LichThi(UserId, SubjectId, TestId, Time_Start, Time_Close, TestName, Date, Time_Test, InTest));
			}
			
			sql= "{call dbo.spLichThi1(?)}";
			cstmt=conn.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			cstmt.setInt(1, Uid);
			
			kq=cstmt.executeQuery();
			
			while(kq.next()) {
				UserId = kq.getInt("UserId");
				SubjectId = kq.getInt("SubjectId");
				TestId = kq.getInt("TestId");
				Time_Test = kq.getInt("Time_Test");
				Time_Start = kq.getString("TimeStart");
				Time_Close = kq.getString("TimeClose");
				TestName = kq.getString("TestName");
				Date = kq.getString("Date");
				InTest = kq.getInt("InTest");
				LichThi.add(new LichThi(UserId, SubjectId, TestId, Time_Start, Time_Close, TestName, Date, Time_Test, InTest));
			}		
			
			sql= "{call dbo.spLichThi2(?)}";
			cstmt=conn.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			cstmt.setInt(1, Uid);
			
			kq=cstmt.executeQuery();
			
			while(kq.next()) {
				UserId = kq.getInt("UserId");
				SubjectId = kq.getInt("SubjectId");
				TestId = kq.getInt("TestId");
				Time_Test = kq.getInt("Time_Test");
				Time_Start = kq.getString("TimeStart");
				Time_Close = kq.getString("TimeClose");
				TestName = kq.getString("TestName");
				Date = kq.getString("Date");
				InTest = kq.getInt("InTest");
				LichThi.add(new LichThi(UserId, SubjectId, TestId, Time_Start, Time_Close, TestName, Date, Time_Test, InTest));
			}			
			
			kq.close();
			cstmt.close();
			conn.close();
			
			return LichThi; 
	}
}










