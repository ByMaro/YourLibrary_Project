package com.yourLibrary.service;

import java.util.List;

import com.yourLibrary.domain.boardVO;

public interface boardService {
	public List<boardVO> boardSelectUserAll(String userid);
}
