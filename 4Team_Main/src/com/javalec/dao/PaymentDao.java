package com.javalec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.javalec.util.ShareVar;
import com.mysql.cj.xdevapi.PreparableStatement;

public class PaymentDao {
	
	private final String url_mysql = ShareVar.DBNAME;
	private final String id_mysql = ShareVar.DBUSER;
	private final String pw_mysql = ShareVar.DBPASS;

	int customerid;			// customer table의 pk
	String productid;		// product table의 pk
	int pnum;				// 
	String pdate;
	int pprice;
	int duration;
	String starttime;
	
	public PaymentDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void insertOrder() { // 결제정보 DB 입력
		PreparedStatement ps = null;
		try {
			// DB 연결
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String query = "insert into purchase (customerid, productid, pnum, pdate, pprice, duration, starttime)";
			String query1 = " values (?, ?, ?, now(), ?, ?, now())";
			
			ps = conn_mysql.prepareStatement(query + query1);
			ps.setInt(1, customerid);
			ps.setString(2, productid);
			ps.setInt(3, pnum);
			ps.setInt(5, pprice);
			ps.setInt(6, duration);
			
			ps.executeUpdate();
			conn_mysql.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	
	
} // End