/*
 * @(#)JoinController.java $version 2015. 2. 7.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.maple.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maple.test.model.Member;
import com.maple.test.service.MemberService;

/**
 * @author Kanghoon Choi
 */
@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;

	@RequestMapping("/join/form")
	public String getJoinForm() {
		return "joinForm";
	}
	
	@RequestMapping("/join")
	public String join(Member member) {
		memberService.join(member);
		return "redirect:/login/form";
	}
	
	@RequestMapping("/login/form")
	public String getLoginForm(Member member) {
		return "loginForm";
	}
	
	@RequestMapping("/login")
	public String login(Member member) {
		memberService.login(member);
		return "loginForm";
	}
}
