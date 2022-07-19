package com.company.dao.impl;

import com.company.entity.EmploymentHistory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Repository("employmentHistoryRepositoryCustomImpl")
public class EmploymentHistoryRepositoryCustomImpl implements EmploymentHistoryRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

	@Override
	public List<EmploymentHistory> getAllEmploymentHistoryById(int id) {
                Query query=em.createQuery("Select emp from EmploymentHistory emp", EmploymentHistory.class);
                List<EmploymentHistory> list=query.getResultList();
                return list;
	}

	@Override
	public boolean addEmploymentHistory(EmploymentHistory obj) {
                          em.getTransaction().begin();
                          em.persist(obj);
                          em.getTransaction().commit();
                          em.close();
                          return true;
	}

	@Override
	public boolean updateEmploymentHistory(EmploymentHistory obj) {
                em.getTransaction().begin();
                em.merge(obj);
                em.getTransaction().commit();
                em.close();
                return true;
	}

	@Override
	public boolean removeEmploymentHistory(int id) {
                          em.getTransaction().begin();
                          List<EmploymentHistory> emp=getAllEmploymentHistoryById(id);                
                          em.remove(emp);
                          em.getTransaction().commit();
                          em.close();
                          return true;
	}
	
}
