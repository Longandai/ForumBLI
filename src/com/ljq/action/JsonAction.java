package com.ljq.action;

import net.sf.json.JSONObject;

import com.ljq.bean.User;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class JsonAction extends ActionSupport {
	private User user;
	// ���ؽ�����ͻ���
	private String result;

	@Override
	public String execute() throws Exception {
		System.out.println("aaaaaaa");
		// ��Ҫ���ص�ʵ��������json����
		JSONObject json = JSONObject.fromObject(user);
		// �����ʽ�磺{"id":1, "username":"zhangsan", "pwd":"123"}
		System.out.println("aaaaaaa" + json);
		result = json.toString();
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}