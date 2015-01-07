package com.ljq.action;

import net.sf.json.JSONObject;

import com.ljq.bean.User;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class JsonAction extends ActionSupport {
	private User user;
	// 返回结果给客户端
	private String result;

	@Override
	public String execute() throws Exception {
		System.out.println("aaaaaaa");
		// 将要返回的实体对象进行json处理
		JSONObject json = JSONObject.fromObject(user);
		// 输出格式如：{"id":1, "username":"zhangsan", "pwd":"123"}
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