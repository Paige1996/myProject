package com.myProject.vo;

public class Board {
	
	private int b_idx;
	private int b_title;
	private int b_content;
	private String b_date;
	private int b_writer;
	private String b_view;
	private String u_idx;
	
	
	public int getB_idx() {
		return b_idx;
	}
	public void setB_idx(int b_idx) {
		this.b_idx = b_idx;
	}
	
	
	public int getB_title() {
		return b_title;
	}
	public void setB_title(int b_title) {
		this.b_title = b_title;
	}
	
	
	public int getB_content() {
		return b_content;
	}
	public void setB_content(int b_content) {
		this.b_content = b_content;
	}
	
	
	public String getB_date() {
		return b_date;
	}
	public void setb_date(String b_date) {
		this.b_date = b_date;
	}
	
	
	
	public int getB_writer() {
		return b_writer;
	}
	public void setB_writer(int b_writer) {
		this.b_writer = b_writer;
	}
	
	
	public String getB_view() {
		return b_view;
	}
	public void setB_view(String b_view) {
		this.b_view = b_view;
	}
	
	public String getU_idx() {
		return b_view;
	}
	public void setU_idx(String u_idx) {
		this.u_idx = u_idx;
	}
}