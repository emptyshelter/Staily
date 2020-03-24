package com.itwill.staily.stylecoodination.model.dao;

import java.util.List;

import com.itwill.staily.util.Board;

public interface StyleCoodinationDao {
	/*
	 * 메인화면
	 */
	public List<Board> selectBoardAll();
	
	//누적 질문 수
	public int selectBoardCount();
	//누적 답변 수 
	public int selectBoardReplyCount();
	
	/*
	 * 상세보기
	 */
	public Board selectBoardOne();
	
	//원글, 답글 수정
	public int updateBoard();

	//원글 삭제
	public int deleteBoard();
	
	//답글 삭제
	public int deleteBoardReply();
	
	//조회수 올리기
	public int updateView();
	
	//답글채택
	public int updateChoice();
	
	//추천수 올리기
	public int updateRecommend();
	
	/*
	 * 질문작성
	 */
	public int createBoard();
	
	//이미지 insert
	public int createBoardDetail();
	
	
	
	
	
}
