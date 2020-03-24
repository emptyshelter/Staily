package com.itwill.staily.mypage.mapper;

import java.util.List;

import com.itwill.staily.mypage.model.dto.Payment;

public interface PaymentMapper {
	public List<Payment> selectList();
	
	public int createPayment();
	
	public int deletePayment();
}
