package com.myProject.vo;

public class Board {
	//int 숫자 string 문자
	private int b_idx;
	private String b_title;
	private String b_content;
	private String b_date;
	private String b_writer;
	private String b_view;
	private int u_idx;
	
	
	public int getB_idx() {
		return b_idx;
	}
	public void setB_idx(int string) {
		this.b_idx = string;
	}
	
	
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	
	
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	
	
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String b_date) {
		this.b_date = b_date;
	}
	
	
	
	public String getB_writer() {
		return b_writer;
	}
	public void setB_writer(String b_writer) {
		this.b_writer = b_writer;
	}
	
	
	public String getB_view() {
		return b_view;
	}
	public void setB_view(String b_view) {
		this.b_view = b_view;
	}
	
	public int getU_idx() {
		return u_idx;
	}
	public void setU_idx(int u_idx) {
		this.u_idx = u_idx;
	}

}