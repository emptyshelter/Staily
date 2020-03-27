package com.itwill.staily.stylecoodination.mapper;

import com.itwill.staily.util.Board;
import com.itwill.staily.util.BoardDetail;

public interface UtilMapper {
	//id를 토대로 m_no 가져오기
	public int selectMNo(int mId);
	
	//원글과 답글 수정
	public int updateBoardAndReply(Board board);
	
	// 이미지 핸들링을 어찌 해야할까나
	public int updateBoardAndReplyDetail(BoardDetail boardDetail);
}
