package com.itwill.staily.stylecoodination.mapper;

import com.itwill.staily.util.Board;

public interface BoardManageMapper {
	public int createBoard(Board b);

	//원글, 답글 수정
	public int updateBoardAndReply(Board board);
	
	public int deleteBoard(int groupNo);
	
}
