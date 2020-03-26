package com.itwill.staily.stylecoodination.mapper;

import java.util.List;

import com.itwill.staily.util.Board;

public interface ViewMapper {
	public List<Board> selectBoardAll();
	
	public Board selectBoardOne(int bNo);
	
	//누적 질문 수
	public int selectBoardCount();
	
	//누적 답변 수 
	public int selectBoardReplyCount();
	
	//조회수 올리기
	public int updateView(int bNo);
}
