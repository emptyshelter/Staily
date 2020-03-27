package com.itwill.staily.detail.service;

import java.util.List;

import com.itwill.staily.detail.model.dao.ReplyDao;
import com.itwill.staily.detail.model.dto.Reply;

public class ReplyServiceImpl implements ReplyService {
	private ReplyDao replyDao;		

	public ReplyServiceImpl() {
		super();
	}

	public void setReplyDao(ReplyDao replyDao) {
		this.replyDao = replyDao;
	}

	@Override
	public List<Reply> selectReplyList(int pNo) throws Exception {
		return replyDao.selectReplyList(pNo);
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
