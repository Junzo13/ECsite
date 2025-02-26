package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;
		if (session.containsKey("login_user_id")) {
			BuyItemDAO buyItemDAO = new BuyItemDAO();
			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
			session.put("in", buyItemDTO.getItemName());
			result = SUCCESS;
		}
		return result;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
