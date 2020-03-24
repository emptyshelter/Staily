package com.itwill.staily.mypage.model.dao;

import java.util.List;

import com.itwill.staily.mypage.mapper.FriendMapper;
import com.itwill.staily.mypage.model.dto.Friend;

public class FriendDaoImpl implements FriendDao {
	
	private FriendMapper friendMapper;
	
	public FriendDaoImpl() {
		
	}
	

	public FriendMapper getFriendMapper() {
		return friendMapper;
	}


	public void setFriendMapper(FriendMapper friendMapper) {
		this.friendMapper = friendMapper;
	}



	@Override
	public List<Friend> selectList(int mNo) {
		List<Friend> friendList = friendMapper.selectList(mNo);
		return friendList;
	}

	@Override
	public int insertFriend(Friend friend) {
		int insertRow = friendMapper.insertFriend(friend);
		return insertRow;
	}

	@Override
	public int deleteFriend(int fNo) {
		int deleteRow = friendMapper.deleteFriend(fNo);
		return deleteRow;
	}

}
