package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class QLDT_LichThiDAO {
	private static final String DRIVER_JDBC = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL_DB = "jdbc:sqlserver://localhost:1433; instance=MSSQLSERVER; databaseName=OnlineTest; user=user; password=123;";

	public List<QLDT_LichThi> getLichThi() throws SQLException {
		String SubjectId;
		String SubjectName;
		String TestId;
		String TestName;
		String TimeStart;
		String TimeClose;
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVER_JDBC);
			conn = DriverManager.getConnection(URL_DB);
			System.out.println("Connected successfully ...");
		} catch (Exception e) {
			System.out.println("Error connection " + e);
			return null;
		}
		String sql = "select Test.TestId, Test.TestName, Subjects.SubjectName, Subjects.SubjectId, Test_Schedule.Time_Start, Test_Schedule.Time_Close From Subjects, Test, Test_Schedule Where Test.TestId = Test_Schedule.TestId And Test_Schedule.SubjectId = Subjects.SubjectId";
		st = conn.createStatement();

		rs = st.executeQuery(sql);
		List<QLDT_LichThi> LichThi = new ArrayList<QLDT_LichThi>();
		while (rs.next()) {
			SubjectId = rs.getString("SubjectId");
			SubjectName = rs.getString("SubjectName");
			TestId = rs.getString("TestId");
			TestName = rs.getString("TestName");
			TimeStart = rs.getString("Time_Start");
			TimeClose = rs.getString("Time_Close");
			LichThi.add(new QLDT_LichThi(SubjectId, SubjectName, TestId, TestName, TimeStart, TimeClose));
		}
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
		return LichThi;
	}
}
