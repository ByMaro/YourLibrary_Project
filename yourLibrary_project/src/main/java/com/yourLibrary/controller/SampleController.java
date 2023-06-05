package com.yourLibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yourLibrary.domain.AuthVO;
import com.yourLibrary.domain.MemberVO;
import com.yourLibrary.service.memberService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/sample/*")
public class SampleController {
	@Setter(onMethod_ = @Autowired)
	private memberService memberservice;

	@Setter(onMethod_ = @Autowired)
	private PasswordEncoder pwencoder;

	@GetMapping("/index")
	public void index(){

	}

	@GetMapping("/all")
	public void doAll() {
		log.info("do all can access everybody");
	}

	@GetMapping("/member")
	public void doMember() {
		log.info("logined member");
	}

	@GetMapping("/admin")
	public void doAdmin() {
		log.info("admin only");
	}

	@RequestMapping(value = "/memberjoin", method = RequestMethod.GET)
	public void dojoin() {
		log.info("member join");
	};

	@RequestMapping(value = "/memberjoin", method = RequestMethod.POST)
	public String dojoinAction(MemberVO vo) {
		MemberVO mvo = new MemberVO();
		mvo.setUserid(vo.getUserid());
		mvo.setUserpw(pwencoder.encode(vo.getUserpw()));
		mvo.setUserName(vo.getUserName());
		mvo.setEmail(vo.getEmail());

		AuthVO avo = new AuthVO();
		avo.setAuth("ROLE_MEMBER");
		avo.setUserid(vo.getUserid());

		memberservice.joinMember(mvo, avo);

		log.info("mvo : "+mvo);
		log.info("avo : "+avo);

		return "redirect:/customLogin";
	}

}