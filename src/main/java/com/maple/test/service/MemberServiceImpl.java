/*
 * @(#)MemberServiceImpl.java $version 2015. 2. 14.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.maple.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maple.test.mapper.MemberMapper;
import com.maple.test.model.Member;

/**
 * @author Kanghoon Choi
 */
@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	@Transactional
	public void join(Member member) {
		
		memberMapper.insertMember(member);
	}

	@Override
	@Transactional
	public boolean login(Member member) {
		
		member = memberMapper.selectMember(member);
		
		return (member == null) ? false : true;
	}

}
