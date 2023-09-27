package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectDB {
	// url, username, pass
		public static final String URL = "jdbc:sqlserver://THAOTTT\\SQLEXPRESS:1433;databaseName= StudentManager_Ex15 ;"
				+ "encrypt=true;trustServerCertificate=true";
		public static final String USER_NAME = "sa";
		public static final String PASSWORD = "thanhthao123";

		// tạo kết nối
		public static Connection getConnection() {
			Connection conn = null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				System.out.println("Connect successful.");
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("Connect fail.");
				e.printStackTrace();
			}

			return conn;
		}

		// Ngắt resultset, statement
		public static void closeRsStm(PreparedStatement stm) {
			if (stm != null) {
				try {
					stm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		public static void closeRs(ResultSet rs) {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		// Ngắt kết nối
		public static void closeConnection(Connection conn) {
			try {
				if (conn != null) {
					conn.close();
					System.out.println("Ngắt Kết Nối Thành Công");
				} else {
					System.out.println("Ngắt Kết Nối Thất Bại");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
