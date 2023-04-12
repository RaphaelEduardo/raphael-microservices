package br.com.raphael;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Greeting {

	private final long id;
	private final String content;

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

}
