package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class LayCauHoiDAO {
	private static final String DRIVER_JDBC = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL_DB = "jdbc:sqlserver://localhost:1433; instance=MSSQLSERVER; databaseName=OnlineTest; user=user; password=123;";

	public static List<NoiDungCauHoi> getDsCauHoi() throws SQLException {
		int QuestionId, KindId;
		String QuestionContent,KindName;
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
		String sql = "select * From Question,KindOfQuestion Where Question.KindId = KindOfQuestion.KindId";
		st = conn.createStatement();

		rs = st.executeQuery(sql);
		List<NoiDungCauHoi> DsCauHoi = new ArrayList<NoiDungCauHoi>();
		while (rs.next()) {
			QuestionId = Integer.valueOf(rs.getString("QuestionId"));
			KindId = Integer.valueOf(rs.getString("KindId"));
			QuestionContent= rs.getString("QuestionContent");
			KindName = rs.getString("KindName");
			DsCauHoi.add(new NoiDungCauHoi(QuestionId, QuestionContent,KindId,KindName));
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
		return DsCauHoi;
	}
}
