package com.itwill.staily.detail.model.dao;

import java.util.List;

import com.itwill.staily.detail.mapper.ReplyMapper;
import com.itwill.staily.detail.model.dto.Reply;

public class ReplyDaoImpl implements ReplyDao {
	private ReplyMapper replyMapper;
	
	public ReplyDaoImpl() {
		// TODO Auto-generated constructor stub
	}	

	public ReplyMapper getReplyMapper() {
		return replyMapper;
	}

	public void setReplyMapper(ReplyMapper replyMapper) {
		this.replyMapper = replyMapper;
	}

	@Override
	public List<Reply> selectReplyList(int pNo) throws Exception {
		List<Reply> replyList = replyMapper.selectReplyList(pNo);
		return replyList;
	}

	@Override
	public boolean createReply(Reply reply) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteReply(Reply reply) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkReplyUser(Reply reply, int mNo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
