package com.laptrinhjava.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.laptrinhjava.dao.ICategoryDAO;
import com.laptrinhjava.model.CategoryModel;

public class CategoryDAO implements ICategoryDAO {

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// load thành công thì return connection
			String url = "jdbc:mysql://localhost:3306/news";
			String user = "root";
			String password = "Nguyenhieu160402@";

			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// Khi load sql null nghãi là connection chưa có gì
			return null;
		}

	}

	@Override
	public List<CategoryModel> findAll() {
		List<CategoryModel> results = new ArrayList<>();
		String sql = "SELECT * FROM category";

		// open connection
		Connection connection = getConnection();
		// Muon excute cau lenh sql can thong qua PreparedStatement
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		if (connection != null) {
			// truyền sql thông qua connection.prepareStatement(sql)
			// sau khi chạy xong sql nó mới tạo statement
			try {
				statement = connection.prepareStatement(sql);
				resultSet = statement.executeQuery();
				while (resultSet.next()) {
					CategoryModel category = new CategoryModel();
					category.setId(resultSet.getLong("id"));
					category.setCode(resultSet.getString("code"));
					category.setName(resultSet.getString("name"));
					results.add(category);
				}

				return results;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				return null;
			} finally {
				try {
					if (connection != null) {
						connection.close();
					}
					if (statement != null) {
						statement.close();
					}
					if (resultSet != null) {
						resultSet.close();
					}
				} catch (SQLException e) {
					return null;
				}

			}

		}
		return null;

	}

}
