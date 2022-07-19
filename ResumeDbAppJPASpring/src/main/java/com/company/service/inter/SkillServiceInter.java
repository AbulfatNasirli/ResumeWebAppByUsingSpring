package com.company.service.inter;

import com.company.entity.Skill;

import java.util.List;

;

public interface SkillServiceInter {

	public List<Skill> getAllSkill();
	
	public Skill getSkillById(int id);
	
	public boolean updateSkill(Skill obj);
	
	public boolean addSkill(Skill obj);
	
	
}
