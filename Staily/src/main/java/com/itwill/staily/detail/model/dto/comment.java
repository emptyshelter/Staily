package com.itwill.staily.detail.model.dto;

public class comment {
	private int m_no; //회원 번호
	private int p_no; //상품 번호
	private int w_no; //작품 번호
	private int c_no; //댓글 번호
	private String c_content; //댓글 내용
	private int c_recommend; //추천 수
	private int c_report; //신고 수
	
	public comment() {
		super();
	}

	public comment(int m_no, int p_no, int w_no, int c_no, String c_content, int c_recommend, int c_report) {
		super();
		this.m_no = m_no;
		this.p_no = p_no;
		this.w_no = w_no;
		this.c_no = c_no;
		this.c_content = c_content;
		this.c_recommend = c_recommend;
		this.c_report = c_report;
	}

	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public int getW_no() {
		return w_no;
	}

	public void setW_no(int w_no) {
		this.w_no = w_no;
	}

	public int getC_no() {
		return c_no;
	}

	public void setC_no(int c_no) {
		this.c_no = c_no;
	}

	public String getC_content() {
		return c_content;
	}

	public void setC_content(String c_content) {
		this.c_content = c_content;
	}

	public int getC_recommend() {
		return c_recommend;
	}

	public void setC_recommend(int c_recommend) {
		this.c_recommend = c_recommend;
	}

	public int getC_report() {
		return c_report;
	}

	public void setC_report(int c_report) {
		this.c_report = c_report;
	}
}
