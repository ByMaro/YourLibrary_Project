package com.yourLibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yourLibrary.domain.AuthVO;
import com.yourLibrary.domain.MemberVO;
import com.yourLibrary.mapper.MemberMapper;

import lombok.Setter;

@Service
public class memberServiceImpl implements memberService{

	@Setter(onMethod_ = @Autowired)
	private MemberMapper mapper;

	@Override
	@Transactional
	public void joinMember(MemberVO mvo, AuthVO avo) {
		// TODO Auto-generated method stub
		mapper.join_member(mvo);
		mapper.join_member_auth(avo);
	}


}