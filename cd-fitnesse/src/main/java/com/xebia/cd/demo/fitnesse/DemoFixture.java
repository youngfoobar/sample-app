package com.xebia.cd.demo.fitnesse;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

public class DemoFixture {

	private int status;
	private String body;
	
	public DemoFixture() throws IOException {
		GetMethod method = new GetMethod(ServerFixture.getServiceUri().toString());
		try {
			status = new HttpClient().executeMethod(method);
			body = method.getResponseBodyAsString();
		} finally {
			method.releaseConnection();
		}
	}
	
	public int status() {
		return status;
	}
	
	public String body() {
		return body;
	}
}
