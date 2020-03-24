package com.itwill.staily.detail.mapper;

import java.util.List;

import com.itwill.staily.detail.model.dto.Comment;

public interface CommentMapper {
	public List<Comment> selectCommentList(int pNo);
	
	public boolean createComment(Comment comment);
	
	public boolean deleteComment(Comment comment);
	
	public boolean checkCommentUser(Comment comment, int mNo);
}
