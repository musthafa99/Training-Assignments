package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Library {
	private int bookid;
	private String bookname;
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void show()
	{
		System.out.println("HI");
	}

}
