package com.bbs.action;

import javax.servlet.http.HttpServletRequest;

import com.bbs.dao.AdminDao;
import com.bbs.model.Admin;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class SignupAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String loginAction() throws Exception {

		System.out.println("登录！");

		HttpServletRequest request = ServletActionContext.getRequest();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String password1 = request.getParameter("password1");
		if (name.isEmpty() || password.isEmpty() || password1.isEmpty()) {
			return ERROR;
		} else {
			if (!password.equals(password1)) {
				System.out.println("两次密码不一致！");
				return ERROR;
			}
			AdminDao adminDao = new AdminDao();
			Admin admin = adminDao.queryUser();
			if (admin.getName().equals(name)
					&& admin.getPassword().equals(password)) {
				return SUCCESS;
			}
		}

		return ERROR;
	}

	public String execute() throws Exception {

		System.out.println("注册");

		HttpServletRequest request = ServletActionContext.getRequest();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String password1 = request.getParameter("password1");
		if (name.isEmpty() || password.isEmpty() || password1.isEmpty()) {
			return ERROR;
		} else {
			if (!password.equals(password1)) {
				System.out.println("两次密码不一致！");
				return ERROR;
			}
			AdminDao adminDao = new AdminDao();
			adminDao.insertUser(name, password);
			return SUCCESS;
		}
		
	}

}
