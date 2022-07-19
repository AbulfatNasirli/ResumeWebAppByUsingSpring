package com.company.service.inter;

import com.company.entity.UserSkill;

import java.util.List;

public interface UserSkillServiceInter {

	public List<UserSkill> getAllSkillByUserId(int userId);
	
	public boolean insertUserSkill(UserSkill obj);
	
	public boolean updateUserSkill(UserSkill obj);
	
	public boolean removeUserSkill(int userId);
}
