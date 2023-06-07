package com.yourLibrary.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yourLibrary.domain.boardVO;
import com.yourLibrary.mapper.boardMapper;
import com.yourLibrary.service.boardService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/library/*")
public class LibraryBoardController {
	@Setter(onMethod_ = @Autowired)
	private boardService bService;
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping("/board")
	public void board(Principal p) {
		String userid = p.getName();

		System.out.println("name : "+userid);
		
		List<boardVO> bvo = bService.boardSelectUserAll(userid);
		
		for(boardVO bufbvo : bvo)
			System.out.println(bufbvo);
		System.out.println("this library board");
	}

	@ResponseBody
	@GetMapping("/boardAllUser")
	public List<boardVO> selectUserAllBoard(Principal p) {
		return bService.boardSelectUserAll(p.getName());
	}
	
	@GetMapping("/header")
	public void header() {}

}