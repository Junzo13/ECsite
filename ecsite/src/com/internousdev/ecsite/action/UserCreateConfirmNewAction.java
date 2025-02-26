package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmNewAction extends ActionSupport implements SessionAware {
	private String loginUserId;
	private String loginPassword;
	private String userName;
	private String userMail;
	private Map<String, Object> session;
	private String errorMessage;

	public String execute() {
		String result = SUCCESS;
		if (!(loginUserId.equals("")) && !(loginPassword.equals("")) && !(userName.equals(""))
				&& !(userMail.equals(""))) {
			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("userName", userName);
			session.put("userMail", userMail);
		} else {
			setErrorMessage("<html><font color=red>＊未入力の項目があります。</font></html>");
			result = ERROR;
		}
		return result;

	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
