package com.company.dao.impl;

import com.company.entity.Skill;

import java.util.List;

;

public interface SkillRepositoryCustom {

	public List<Skill> getAllSkill();
	
	public Skill getSkillById(int id);
	
	public boolean updateSkill(Skill obj);
	
	public boolean addSkill(Skill obj);
	
	
}
