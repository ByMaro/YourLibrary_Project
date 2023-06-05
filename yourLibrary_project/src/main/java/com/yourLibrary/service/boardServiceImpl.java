package com.yourLibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yourLibrary.domain.boardVO;
import com.yourLibrary.mapper.boardMapper;

import lombok.Setter;

@Service
public class boardServiceImpl implements boardService {
	@Setter(onMethod_ = @Autowired)
	private boardMapper bmapper;

	@Override
	public List<boardVO> boardSelectUserAll(String userid) {
		// TODO Auto-generated method stub
		return bmapper.boardSelectUserAll(userid);
	}

}