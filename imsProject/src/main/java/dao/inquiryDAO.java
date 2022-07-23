package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.Inquiry;
import comm.dbConnection;

public class inquiryDAO {
	//add inquiry
	public int insertInquiry(Inquiry inquiry) {
		// 変数宣言
		Connection con = null; // DBコネクション
		Statement smt = null; // SQLステートメント
		int count = 0; //return用変数

		// SQL文
		String sql = "INSERT INTO Inquiry VALUES('"
				+ inquiry.getName() + "','"
				+ inquiry.getSex() + "','"
				+ inquiry.getAge() + "','"
				+ inquiry.getEmail() + "','"
				+ inquiry.getAddress() + "', CURDATE(), '"
				+ inquiry.getCategory() + "','"
				+ inquiry.getDescription() + "')";

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

	//get inquiry list

	//get inquiry by inquiryID
	public Inquiry selectInquiryByInquiryID(String inquiryID) {
		// 変数宣言
		Connection con = null; // DBコネクション
		Statement smt = null; // SQLステートメント
		PreparedStatement ps = null;

		// 配列宣言
		Inquiry inquiry = new Inquiry();

		// SQL文作成
		String sql = "SELECT * FROM Inquiry WHERE inquiryID =?";

		try {
			// DBに接続
			con = dbConnection.getConnection();
			smt = con.createStatement();

			// SQL文発行
			ps = con.prepareStatement(sql);
			ps.setString(1, inquiryID);
			ResultSet rs = ps.executeQuery();

			// 検索結果をArrayListに格納
			if (rs.next()) {
				inquiry.setInquiryID(rs.getInt("inquiryID"));
				inquiry.setName(rs.getString("name"));
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

		return inquiry;
	}
}