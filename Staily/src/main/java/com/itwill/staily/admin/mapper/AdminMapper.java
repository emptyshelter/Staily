package com.itwill.staily.admin.mapper;

import java.util.List;

import com.itwill.staily.util.Member;
import com.itwill.staily.util.Work;

public interface AdminMapper {
	/* 회원 */
	
	//회원 전체출력
	public List<Member> selectMemberAll();
	
	//회원 개별출력
	public Member selectMemberOne(int mNo);
	
	//회원 수정
	public int updateMember(int mNo);
	
	//회원삭제
	public int deleteMember(int mNo);
	
	/* 작품 */
	public List<Work>selectWorkAll();
	
	/* 상품 */
	
	/* 게시글승인 */
}
