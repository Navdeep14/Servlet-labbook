package cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cg.bean.Training;
import cg.util.JdbcUtil;

public class TrainingDao implements ITrainingDao {

	@Override
	public List<Training> fetchdetails() {
		String sql = "select * from Training";
		Connection conn = null;
		List<Training> list = new ArrayList<Training>();
		try {
			conn = JdbcUtil.getConnection();
		} catch (SQLException e1) {
			System.out.println(e1);
		}
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new Training(rs.getInt(1), rs.getString(2), rs
						.getInt(3)));
			}
			return list;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println(e);
				}
		}
	}

	@Override
	public void enroll(String id) {
		String sql = "update Training set AVAILABLESEATS=AVAILABLESEATS-1 where TRAININGNAME=?";
		Connection conn = null;
		try {
			conn = JdbcUtil.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e);

		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println(e);
				}
		}

	}

}
