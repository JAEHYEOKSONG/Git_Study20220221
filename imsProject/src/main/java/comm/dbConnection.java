package comm;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
	// データベース接続情報
	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost/imsdb";
	private static String USER = "root";
	private static String PASS = "root123";

	/**
	 * コネクションを取得する
	 *
	 * @return connection
	 */
	public static Connection getConnection() {
		Connection con = null; // コネクション
		try {
			Class.forName(RDB_DRIVE);
			con = DriverManager.getConnection(URL, USER, PASS);
			return con;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}
}