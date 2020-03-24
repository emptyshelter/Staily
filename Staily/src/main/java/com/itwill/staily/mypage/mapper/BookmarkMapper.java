package com.itwill.staily.mypage.mapper;

import java.util.List;

import com.itwill.staily.mypage.model.dto.Bookmark;

public interface BookmarkMapper {
	public List<Bookmark> bookmarkList();
	
	public int insertBookmark();
	
	public int deleteBookmark();
	
	
}
