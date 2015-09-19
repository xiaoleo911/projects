package com.bbs.action;

import javax.servlet.http.HttpServletRequest;
import com.bbs.dao.AdminDao;
import org.apache.catalina.User;
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
	
	public String execute() throws Exception{
		
		System.out.println("我进来了！");
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		if(name.isEmpty() || password.isEmpty()){
			return ERROR;
		}else{
			AdminDao adminDao = new AdminDao();
			String result = adminDao.queryUser();
			if(result.equals("success")){
				return SUCCESS; 
			}
		}
		
		return ERROR;
	}

}
