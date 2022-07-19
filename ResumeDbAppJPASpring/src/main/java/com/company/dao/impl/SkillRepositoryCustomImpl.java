package com.company.dao.impl;

import com.company.entity.Skill;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository("skillRepositoryCustomImpl")
public class SkillRepositoryCustomImpl implements SkillRepositoryCustom {

    @PersistenceContext
    private EntityManager em;
	@Override
	public List<Skill> getAllSkill() {
                          Query query=em.createQuery("Select s from Skill s", Skill.class);
                          List<Skill> list=query.getResultList();
                          em.close();
                          return list;
	}

	@Override
	public Skill getSkillById(int id) {
                Skill skill=em.find(Skill.class, id);
                em.close();
                return skill;
	}

	@Override
	public boolean updateSkill(Skill obj) {
                em.getTransaction().begin();
                em.merge(obj);
                em.getTransaction().commit();
                em.close();
                return true;
	}

	@Override
	public boolean addSkill(Skill obj) {
                em.getTransaction().begin();
                em.persist(obj);
                em.getTransaction().commit();
                em.close();
                return true;
	}

	
	
}
