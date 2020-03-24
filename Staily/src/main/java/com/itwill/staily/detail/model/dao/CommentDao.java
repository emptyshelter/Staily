package com.itwill.staily.detail.model.dao;

import java.util.List;

import com.itwill.staily.detail.model.dto.Comment;

public interface CommentDao {
	List<Comment> selectCommentAll() throws Exception;
	
	boolean createComment(Comment comment) throws Exception;
	
	boolean deleteComment(Comment comment) throws Exception;
	
	boolean checkCommentUser(Comment comment, int mNo) throws Exception;
}
