package com.itwill.staily.mypage.mapper;

import java.util.List;

import com.itwill.staily.mypage.model.dto.Friend;

public interface FriendMapper {
	public List<Friend> friendList();
	
	public int insertFriend();
	
	public int deleteFriend();

}
