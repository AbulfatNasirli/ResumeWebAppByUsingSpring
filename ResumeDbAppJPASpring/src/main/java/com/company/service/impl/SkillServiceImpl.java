package com.company.service.impl;

import com.company.dao.impl.SkillRepository;
import com.company.entity.Skill;
import com.company.service.inter.SkillServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillServiceImpl implements SkillServiceInter {


    @Autowired
    private SkillRepository skillDao;
	
	@Override
	public List<Skill> getAllSkill() {
	    return skillDao.getAllSkill();
	}

	@Override
	public Skill getSkillById(int id) {
		return skillDao.getSkillById(id);
	}

	@Override
	public boolean updateSkill(Skill obj) {
		return skillDao.updateSkill(obj);
	}

	@Override
	public boolean addSkill(Skill obj) {
		return skillDao.addSkill(obj);
	}

	
	
}
