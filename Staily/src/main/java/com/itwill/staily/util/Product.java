package com.itwill.staily.util;

public class Product {
	private int p_no; //상품 번호
	private int m_no; //회원 번호
	private int w_no; //작품 번호
	private String p_name; //상품 이름
	private int p_price; //상품 가격
	private String p_url; //상품 url
	private String p_address; //상품 주소
	private String p_daddress; //상품 상세 주소
	private String p_check; //상품 승인 여부
	private int p_view; //상품 조회 수
	
	public Product() {
		super();
	}

	public Product(int p_no, int m_no, int w_no, String p_name, int p_price, String p_url, String p_address,
			String p_daddress, String p_check, int p_view) {
		super();
		this.p_no = p_no;
		this.m_no = m_no;
		this.w_no = w_no;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_url = p_url;
		this.p_address = p_address;
		this.p_daddress = p_daddress;
		this.p_check = p_check;
		this.p_view = p_view;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public int getW_no() {
		return w_no;
	}

	public void setW_no(int w_no) {
		this.w_no = w_no;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public String getP_url() {
		return p_url;
	}

	public void setP_url(String p_url) {
		this.p_url = p_url;
	}

	public String getP_address() {
		return p_address;
	}

	public void setP_address(String p_address) {
		this.p_address = p_address;
	}

	public String getP_daddress() {
		return p_daddress;
	}

	public void setP_daddress(String p_daddress) {
		this.p_daddress = p_daddress;
	}

	public String getP_check() {
		return p_check;
	}

	public void setP_check(String p_check) {
		this.p_check = p_check;
	}

	public int getP_view() {
		return p_view;
	}

	public void setP_view(int p_view) {
		this.p_view = p_view;
	}	
}
