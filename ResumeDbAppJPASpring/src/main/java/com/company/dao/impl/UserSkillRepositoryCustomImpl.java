package com.company.dao.impl;

import com.company.entity.UserSkill;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository("userSkillRepositoryCustomImpl")
public class UserSkillRepositoryCustomImpl implements UserSkillRepositoryCustom {

    @PersistenceContext
    private EntityManager em;
	
	@Override
	public List<UserSkill> getAllSkillByUserId(int userId) {
                Query query=em.createQuery("Select us from UserSkill us", UserSkill.class);
                List<UserSkill> list=query.getResultList();
                em.close();
                return list;
	}

	@Override
	public boolean insertUserSkill(UserSkill obj) {
                em.getTransaction().begin();
                em.persist(obj);
                em.getTransaction().commit();
                em.close();
                return true;
	}

	@Override
	public boolean updateUserSkill(UserSkill obj) {
                em.getTransaction().begin();
                em.merge(obj);
                em.getTransaction().commit();
                em.close();
                return true;
	}

	@Override
	public boolean removeUserSkill(int id) {
                em.getTransaction().begin();
                UserSkill us=em.find(UserSkill.class, id);
                em.remove(us);
                em.getTransaction().commit();
                em.close();
                return true;
	}

}
