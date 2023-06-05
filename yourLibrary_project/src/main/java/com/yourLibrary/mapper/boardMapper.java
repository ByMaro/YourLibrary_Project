package com.yourLibrary.mapper;


import java.util.List;

import com.yourLibrary.domain.boardVO;

public interface boardMapper {
	public List<boardVO> boardSelectUserAll(String userid);
}