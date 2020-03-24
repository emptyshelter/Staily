package com.itwill.staily.util;
/*
W_NO	NUMBER	No		1	작품번호
W_NAME	VARCHAR2(50 BYTE)	Yes		2	작품이름
W_CATEGORY	CHAR(1 BYTE)	Yes		3	작품카테고리
W_DATE	VARCHAR2(12 BYTE)	Yes		4	작품날짜
W_POSTER	VARCHAR2(200 BYTE)	Yes		5	작품포스터
W_TEPISODE	NUMBER	Yes		6	작품전체회차
W_VIEW	NUMBER	Yes		7	작품조회수 
 
 */
public class Work {
	private int wNo;
	private String wName;
	private String wCategory;
	private String wDate;
	private String wPoster;
	private int wTepisode;
	private int wView;
	public int getwNo() {
		return wNo;
	}
	public void setwNo(int wNo) {
		this.wNo = wNo;
	}
	public String getwName() {
		return wName;
	}
	public void setwName(String wName) {
		this.wName = wName;
	}
	public String getwCategory() {
		return wCategory;
	}
	public void setwCategory(String wCategory) {
		this.wCategory = wCategory;
	}
	public String getwDate() {
		return wDate;
	}
	public void setwDate(String wDate) {
		this.wDate = wDate;
	}
	public String getwPoster() {
		return wPoster;
	}
	public void setwPoster(String wPoster) {
		this.wPoster = wPoster;
	}
	public int getwTepisode() {
		return wTepisode;
	}
	public void setwTepisode(int wTepisode) {
		this.wTepisode = wTepisode;
	}
	public int getwView() {
		return wView;
	}
	public void setwView(int wView) {
		this.wView = wView;
	}
	public Work(int wNo, String wName, String wCategory, String wDate, String wPoster, int wTepisode, int wView) {
		super();
		this.wNo = wNo;
		this.wName = wName;
		this.wCategory = wCategory;
		this.wDate = wDate;
		this.wPoster = wPoster;
		this.wTepisode = wTepisode;
		this.wView = wView;
	} 
	
}
