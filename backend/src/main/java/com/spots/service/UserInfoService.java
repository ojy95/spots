package com.spots.service;

import java.util.List;

import com.spots.dto.UserInfo;

public interface UserInfoService {
	
	public int signUp(UserInfo user);
	
	public int modify(UserInfo dto);
	 
	public UserInfo detail(String email);
	  
	public UserInfo findPwdByEmail(String email);
	
	public int joinTeam(int uid, int team_uid);

	public int outTeam(int uid);

	public int applyTeam(int uid, int team_uid, String comment);
}
