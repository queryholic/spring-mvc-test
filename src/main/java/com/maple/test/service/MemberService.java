/*
 * @(#)MemberService.java $version 2015. 2. 14.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.maple.test.service;

import com.maple.test.model.Member;

/**
 * @author Kanghoon Choi
 */
public interface MemberService {

	/**
	 * @param member
	 */
	void join(Member member);

	/**
	 * @param member
	 */
	boolean login(Member member);

}
