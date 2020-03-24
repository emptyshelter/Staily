package com.itwill.staily.mypage.mapper;

import java.util.List;

import com.itwill.staily.mypage.model.dto.Message;

public interface MessageMapper {
	public Message selectOne();
	
	public List<Message> selectList();
	
	public int insertMessage();
	
	public int deleteMessage();
	
	public int updateMessage();
}
