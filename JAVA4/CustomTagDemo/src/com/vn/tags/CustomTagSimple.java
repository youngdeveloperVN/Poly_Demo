package com.vn.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomTagSimple extends SimpleTagSupport {

	private String message;

	@Override
	public void doTag() throws JspException, IOException {
		try {
			getJspContext().getOut().print("<a href='https://google.com'>"+ message +"</a>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
