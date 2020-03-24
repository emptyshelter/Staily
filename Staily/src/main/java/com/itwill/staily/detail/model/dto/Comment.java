package com.itwill.staily.detail.model.dto;

public class Comment {
	private int cNno; //회원 번호
	private int cPno; //상품 번호
	private int cCno; //댓글 번호
	private String cContent; //댓글 내용
	private int cRecommend; //추천 수
	private int cReport; //신고 수
	
	public Comment() {
		super();
	}

	public Comment(int cNno, int cPno, int cCno, String cContent, int cRecommend, int cReport) {
		super();
		this.cNno = cNno;
		this.cPno = cPno;
		this.cCno = cCno;
		this.cContent = cContent;
		this.cRecommend = cRecommend;
		this.cReport = cReport;
	}

	public int getcNno() {
		return cNno;
	}

	public void setcNno(int cNno) {
		this.cNno = cNno;
	}

	public int getcPno() {
		return cPno;
	}

	public void setcPno(int cPno) {
		this.cPno = cPno;
	}

	public int getcCno() {
		return cCno;
	}

	public void setcCno(int cCno) {
		this.cCno = cCno;
	}

	public String getcContent() {
		return cContent;
	}

	public void setcContent(String cContent) {
		this.cContent = cContent;
	}

	public int getcRecommend() {
		return cRecommend;
	}

	public void setcRecommend(int cRecommend) {
		this.cRecommend = cRecommend;
	}

	public int getcReport() {
		return cReport;
	}

	public void setcReport(int cReport) {
		this.cReport = cReport;
	}

}