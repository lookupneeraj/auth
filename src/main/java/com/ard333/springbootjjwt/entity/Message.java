package com.ard333.springbootjjwt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ard333
 */
@NoArgsConstructor @AllArgsConstructor @Data
public class Message {
	
	private String content;

	public Message(String content) {
		this.content = content;
		
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
