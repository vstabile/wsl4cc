package com.sap.ateam.wsl4cc.io;

import java.util.Map;

public class Wsl4ccInput {
	private String methodType;
	private String methodName;
	private Map<String, Object> methodParams;
	private Map<String, Object> methodTables;
	
	public String getMethodType() {
		return methodType;
	}
	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public Map<String, Object> getMethodParams() {
		return methodParams;
	}
	public void setMethodParams(Map<String, Object> methodParams) {
		this.methodParams = methodParams;
	}
	public Map<String, Object> getMethodTables() {
		return methodTables;
	}
	public void setMethodTables(Map<String, Object> methodTables) {
		this.methodTables = methodTables;
	}
}
