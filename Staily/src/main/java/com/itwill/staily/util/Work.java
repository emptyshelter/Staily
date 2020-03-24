package com.itwill.staily.util;
/*
W_NO	NUMBER	No		1	��ǰ��ȣ
W_NAME	VARCHAR2(50 BYTE)	Yes		2	��ǰ�̸�
W_CATEGORY	CHAR(1 BYTE)	Yes		3	��ǰī�װ�
W_DATE	VARCHAR2(12 BYTE)	Yes		4	��ǰ��¥
W_POSTER	VARCHAR2(200 BYTE)	Yes		5	��ǰ������
W_TEPISODE	NUMBER	Yes		6	��ǰ��üȸ��
W_VIEW	NUMBER	Yes		7	��ǰ��ȸ�� 
 
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
