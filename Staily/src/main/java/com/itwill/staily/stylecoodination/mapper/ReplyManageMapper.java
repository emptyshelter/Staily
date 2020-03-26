package com.itwill.staily.stylecoodination.mapper;

import com.itwill.staily.util.Board;

public interface ReplyManageMapper {
	//답글 수정은 질문관리에 있음

	/******************* 답글쓰기 작업 *****************/
	//기존의 답글 step 하나씩 미루기
	public int updateStep(int bGroupNo);
	//id를 토대로 m_no 가져오기
	public int selectMNo(int mId);
	//답글 쓰기
	public int createReply(Board boardReply);
	/**************************************************/
	
	/********************여기 매퍼작업 안함************************/
	//답글 삭제
	public int deleteReply(int bNo);
	
	//답글채택
	public int updateChoice(int bNo);
	
	//추천수 올리기
	public int updateRecommend(int bNo);
		
}
