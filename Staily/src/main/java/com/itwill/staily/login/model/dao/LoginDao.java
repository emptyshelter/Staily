package com.itwill.staily.login.model.dao;

import com.itwill.staily.util.Member;

public interface LoginDao {
	/*
	 * 로그인
	 */
	public Member selectMemberOne();
	
	public String selectIdOne();
	
	public String selectPwOne();
	
	/*
	 * 회원가입
	 */
	public int createMember();
	
	public int createCompany();
	
}
