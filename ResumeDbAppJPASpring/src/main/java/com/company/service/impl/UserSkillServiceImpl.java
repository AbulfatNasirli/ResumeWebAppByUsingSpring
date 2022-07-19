package com.company.service.impl;

import com.company.dao.impl.UserSkillRepository;
import com.company.entity.UserSkill;
import com.company.service.inter.UserSkillServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserSkillServiceImpl implements UserSkillServiceInter {

    @Autowired
    private UserSkillRepository userSkillDao;

	@Override
	public List<UserSkill> getAllSkillByUserId(int userId) {
		return userSkillDao.getAllSkillByUserId(userId);
	}

	@Override
	public boolean insertUserSkill(UserSkill obj) {
        return userSkillDao.insertUserSkill(obj);
	}

	@Override
	public boolean updateUserSkill(UserSkill obj) {
        return userSkillDao.updateUserSkill(obj);
	}

	@Override
	public boolean removeUserSkill(int id) {
        return userSkillDao.removeUserSkill(id);
	}

}
