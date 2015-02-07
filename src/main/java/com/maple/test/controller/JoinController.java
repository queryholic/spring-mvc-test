/*
 * @(#)JoinController.java $version 2015. 2. 7.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.maple.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Kanghoon Choi
 */
@Controller
public class JoinController {

	@RequestMapping("/join")
	public String join() {
		return "join";
	}
}
