package com.itwill.staily.util;

public class BoardDetailDto {
	/*
	 이름       널?       유형            
	-------- -------- ------------- 
	B_NO     NOT NULL NUMBER        
	BD_IMAGE NOT NULL VARCHAR2(200) 
	 */
	private int bNo; //게시물번호
	private String bdImage; //이미지
	
	
	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	public String getBdImage() {
		return bdImage;
	}
	public void setBdImage(String bdImage) {
		this.bdImage = bdImage;
	}
	
}
