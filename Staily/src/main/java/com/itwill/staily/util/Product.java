package com.itwill.staily.util;

/*
	m_no NUMBER NOT NULL, 회원번호
	p_no NUMBER NOT NULL, 상품번호
	w_no NUMBER NOT NULL, 작품번호
	p_name VARCHAR2(200), 상품이름
	p_price NUMBER, 상품가격
	p_url VARCHAR2(200), 상품url
	p_address VARCHAR2(100), 상품주소
	p_daddrress VARCHAR2(50), 상품상세주소
	p_check CHAR(1), 상품승인여부
	p_view NUMBER, 상품조회수
	p_date VARCHAR2(12) 상품등록일
 */

public class Product {
	private int pNo; //상품 번호
	private int pMno; //회원 번호
	private int pWno; //작품 번호
	private String pName; //상품 이름
	private int pPrice; //상품 가격
	private String pUrl; //상품 url
	private String pAddress; //상품 주소
	private String pDaddress; //상품 상세 주소
	private String pCheck; //상품 승인 여부
	private int pView; //상품 조회 수
	
	public Product() {
		super();
	}

	public Product(int pNo, int pMno, int pWno, String pName, int pPrice, String pUrl, String pAddress,
			String pDaddress, String pCheck, int pView) {
		super();
		this.pNo = pNo;
		this.pMno = pMno;
		this.pWno = pWno;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pUrl = pUrl;
		this.pAddress = pAddress;
		this.pDaddress = pDaddress;
		this.pCheck = pCheck;
		this.pView = pView;
	}

	public int getpNo() {
		return pNo;
	}

	public void setpNo(int pNo) {
		this.pNo = pNo;
	}

	public int getpMno() {
		return pMno;
	}

	public void setpMno(int pMno) {
		this.pMno = pMno;
	}

	public int getpWno() {
		return pWno;
	}

	public void setpWno(int pWno) {
		this.pWno = pWno;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public String getpUrl() {
		return pUrl;
	}

	public void setpUrl(String pUrl) {
		this.pUrl = pUrl;
	}

	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	public String getpDaddress() {
		return pDaddress;
	}

	public void setpDaddress(String pDaddress) {
		this.pDaddress = pDaddress;
	}

	public String getpCheck() {
		return pCheck;
	}

	public void setpCheck(String pCheck) {
		this.pCheck = pCheck;
	}

	public int getpView() {
		return pView;
	}

	public void setpView(int pView) {
		this.pView = pView;
	}
	
	
}
