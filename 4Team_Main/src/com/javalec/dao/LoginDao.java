package com.javalec.dao;

import com.javalec.util.ShareVar;

public class LoginDao {
	// Field
		String id;
		String password;
		
		private final String url_mysql = ShareVar.DBNAME; //sql에서 db가져오기
		private final String id_mysql = ShareVar.DBUSER;
		private final String pw_mysql = ShareVar.DBPASS;
		
		
		// Constructor
		public LoginDao() {
			// TODO Auto-generated constructor stub
		}


		public LoginDao(String id, String password) {
			super();
			this.id = id;
			this.password = password;
		}
		
		
		

}
