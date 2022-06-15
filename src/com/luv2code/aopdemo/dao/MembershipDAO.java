package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public Boolean addSillyMember() {
		
		System.out.println(getClass()+ ": Adding membership account :");
		
		return true;
	}
}
