package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

public class ThemTaiKhoanDAO {
	
	private static final String DRIVER_JDBC = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL_DB = "jdbc:sqlserver://localhost:1433; instance=MSSQLSERVER; databaseName=OnlineTest; user=user; password=123;";
	
	public void ThemTaiKhoan(String UserName, String FullName, String Pass, String Birth, String CMND, String Tel) throws SQLException {
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=OnlineTest;user=user;password=123";
		Connection conn = null;
		PreparedStatement cstmt = null;
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return;
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String sql= "{call dbo.spThemUser(?,?,?,?,?,?)}";
			cstmt=conn.prepareStatement(sql);
			
			cstmt.setString(1, UserName);
			cstmt.setString(2, FullName);
			cstmt.setString(3, Pass);
			cstmt.setString(4, Birth);
			cstmt.setString(5,CMND);
			cstmt.setString(6, Tel);
			
			int temp = cstmt.executeUpdate();
			
			cstmt.close();
			conn.close();
	}
	
	public int getTaiKhoanVuaThem() throws SQLException {
		Connection conn = null;
		String UserId;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVER_JDBC);
			conn = DriverManager.getConnection(URL_DB);
			System.out.println("Connected successfully ...");
		} catch (Exception e) {
			System.out.println("Error connection " + e);
		}
		String sql = "select UserId From Users";
		st = conn.createStatement();

		rs = st.executeQuery(sql);
		
		List<String> ListUserId = new ArrayList<String>();
		while (rs.next()) {
				UserId = rs.getString("UserId");
				ListUserId.add(UserId);
		}
		String LastId = (String)ListUserId.get(ListUserId.size()-1);
		int lastId = Integer.valueOf(LastId); 
		
		try {
			if (conn != null) {
				conn.close();
			}
			if (st != null) {
				st.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return lastId;
	}
	
	public void ThemUserRoles(String UserId, String RoleId) throws SQLException {
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=OnlineTest;user=user;password=123";
		Connection conn = null;
		PreparedStatement cstmt = null;
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return;
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String sql= "{call dbo.spThemUserRoles(?,?)}";
			cstmt=conn.prepareStatement(sql);
			
			int userId = Integer.valueOf(UserId);
			cstmt.setInt(1, userId);
			cstmt.setString(2, RoleId);
			
			int temp = cstmt.executeUpdate();
			
			cstmt.close();
			conn.close();
	}
	
	public void ThemSubjectStudent(String UserId, String SubjectId) throws SQLException {
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=OnlineTest;user=user;password=123";
		Connection conn = null;
		PreparedStatement cstmt = null;
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return;
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String sql= "{call dbo.spThemSubjectStudent(?,?)}";
			cstmt=conn.prepareStatement(sql);
			
			int userId = Integer.valueOf(UserId);
			cstmt.setInt(1, userId);
			cstmt.setString(2, SubjectId);
			
			int temp = cstmt.executeUpdate();
			
			cstmt.close();
			conn.close();
	}
}
