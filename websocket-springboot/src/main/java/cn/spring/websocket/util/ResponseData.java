package cn.spring.websocket.util;

import java.util.List;

public class ResponseData<T> {
	
	private static final String SUCCESS_MESSAGE = "操作完成";
	private static final String ERROR_MESSAGE = "操作失败";
	
	private String code;
	private String message;
	
	private List<T> resultList;
	
	private T entity;

	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<T> getResultList() {
		return resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}
}
