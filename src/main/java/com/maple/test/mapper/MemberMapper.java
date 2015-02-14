/*
 * @(#)MemberMapper.java $version 2015. 2. 14.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.maple.test.mapper;

import com.maple.test.model.Member;

/**
 * @author Kanghoon Choi
 */
public interface MemberMapper {

	/**
	 * @param member
	 */
	void insertMember(Member member);

	/**
	 * @param member
	 * @return
	 */
	Member selectMember(Member member);

}
