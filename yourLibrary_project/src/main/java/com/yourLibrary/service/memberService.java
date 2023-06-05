package com.yourLibrary.service;

import com.yourLibrary.domain.AuthVO;
import com.yourLibrary.domain.MemberVO;

public interface memberService {
	public void joinMember(MemberVO mvo, AuthVO avo);
}
