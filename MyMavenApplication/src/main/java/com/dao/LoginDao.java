package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.bean.LoginBean;
import com.service.LoginService;
import com.util.DBConnection;

public class LoginDao implements LoginService {

	Connection conn;
	PreparedStatement pstmt;

	public boolean addLogin1( LoginBean LoginBean) {

		boolean flag = false;
		conn = DBConnection.getDBConnection();
		if (conn != null) {

			
			String insertSQL = "insert into pruthviraj(NAME,EMAIL,PASSWORD,ADDRESS,NUMBER)values(?,?,?,?)";
			try {
				pstmt = conn.prepareStatement(insertSQL);
				pstmt.setString(1, LoginBean.getNAME());
				pstmt.setString(2, LoginBean.getsEMAIL());
				pstmt.setString(3, LoginBean.getsPASSWORD());
				pstmt.setInt(4,LoginBean.getsADDRESS());
				pstmt.setInt(4,LoginBean.getNUMBER());
				int res = pstmt.executeUpdate();
				if(res>0){
					
					flag= true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}

		return flag;
	}

	public <LoginPageBean> List<LoginPageBean> getAllLoginPageBean() {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteloginPageBean(int eId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean addLogin(LoginBean LoginBean) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<LoginBean> getAllLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteLogin(int ADDRESS) {
		// TODO Auto-generated method stub
		return 0;
	}

}
