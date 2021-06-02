package com.service;

import java.util.List;

import com.bean.LoginBean;

public interface LoginService {

	public boolean addLogin(LoginBean LoginBean);

	public List<LoginBean> getAllLogin();

	public int deleteLogin(int ADDRESS);
	
	
	
	
}
