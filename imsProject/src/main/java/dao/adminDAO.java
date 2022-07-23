package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.Admin;
import comm.dbConnection;


public class adminDAO {
	//get Admin by loginID
	public Admin selectAdminByLoginID(String loginID) {
		// 変数宣言
		Connection con = null; // DBコネクション
		Statement smt = null; // SQLステートメント
		PreparedStatement ps = null;

		// 配列宣言
		Admin admin = new Admin();

		// SQL文作成
		String sql = "SELECT * FROM Admin WHERE loginID =?";

		try {
			// DBに接続
			con = dbConnection.getConnection();
			smt = con.createStatement();

			// SQL文発行
			ps = con.prepareStatement(sql);
			ps.setString(1, loginID);
			ResultSet rs = ps.executeQuery();

			// 検索結果をArrayListに格納
			if (rs.next()) {
				admin.setAdminID(rs.getInt("adminID"));
				admin.setLoginID(rs.getString("loginID"));
				admin.setLoginPW(rs.getString("loginPW"));
			}
		} catch (SQLException e) {
			System.out.println("Errorが発生しました！\n" + e);
		} finally {
			// リソースの開放
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}

		return admin;
	}

	//add admin - option
	public int insertAdmin(Admin admin) {
		// 変数宣言
		Connection con = null; // DBコネクション
		Statement smt = null; // SQLステートメント
		int count = 0; //return用変数

		// SQL文
		String sql = "INSERT INTO Admin VALUES('"
				+ admin.getLoginID() + "','"
				+ admin.getLoginPW() + "')";

		try {
			con = dbConnection.getConnection();
			smt = con.createStatement();

			//SQLをDBへ発行
			count = smt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Errorが発生しました！\n" + e + "\n");
		} finally {
			// リソースの開放
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}
		return count;
	}
}