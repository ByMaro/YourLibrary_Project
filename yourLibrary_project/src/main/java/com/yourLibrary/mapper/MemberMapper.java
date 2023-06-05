package com.yourLibrary.mapper;

import com.yourLibrary.domain.AuthVO;
import com.yourLibrary.domain.MemberVO;

public interface MemberMapper {
	public MemberVO read(String userid);
	public int join_member(MemberVO mvo);
	public int join_member_auth(AuthVO avo);
}