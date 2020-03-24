package com.itwill.staily.detail.model.dto;

public class Reply {
	private int rNno; //회원 번호
	private int rPno; //상품 번호
	private int rCno; //댓글 번호
	private String rContent; //댓글 내용
	private int rRecommend; //추천 수
	private int rReport; //신고 수
	
	public Reply() {
		super();
	}

	public Reply(int rNno, int rPno, int rCno, String rContent, int rRecommend, int rReport) {
		super();
		this.rNno = rNno;
		this.rPno = rPno;
		this.rCno = rCno;
		this.rContent = rContent;
		this.rRecommend = rRecommend;
		this.rReport = rReport;
	}

	public int getrNno() {
		return rNno;
	}

	public void setrNno(int rNno) {
		this.rNno = rNno;
	}

	public int getrPno() {
		return rPno;
	}

	public void setrPno(int rPno) {
		this.rPno = rPno;
	}

	public int getrCno() {
		return rCno;
	}

	public void setrCno(int rCno) {
		this.rCno = rCno;
	}

	public String getrContent() {
		return rContent;
	}

	public void setrContent(String rContent) {
		this.rContent = rContent;
	}

	public int getrRecommend() {
		return rRecommend;
	}

	public void setrRecommend(int rRecommend) {
		this.rRecommend = rRecommend;
	}

	public int getrReport() {
		return rReport;
	}

	public void setrReport(int rReport) {
		this.rReport = rReport;
	} 
}