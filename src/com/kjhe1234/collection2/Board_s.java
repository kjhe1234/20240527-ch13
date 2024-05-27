package com.kjhe1234.collection2;

public class Board_s {
	
	//subject(제목), content(내용), writer(글쓴이)
	
	String subject;
	String content;
	String writer;
	
	public Board_s() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Board_s(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	

}
