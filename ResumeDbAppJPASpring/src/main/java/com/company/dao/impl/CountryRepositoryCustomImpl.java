package com.company.dao.impl;

import com.company.entity.Country;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository("countryRepositoryCustomImpl")
public class CountryRepositoryCustomImpl implements CountryRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

	@Override
	public List<Country> getAllCountry() {
                          Query query=em.createQuery("Select c from Country c", Country.class);
			List<Country> list=query.getResultList();
                        return list;
	}

	@Override
	public boolean addCountry(Country obj) {
         em.getTransaction().begin();
         em.persist(obj);
         em.getTransaction().commit();
         
         em.close();
         return true;
	}

	@Override
	public boolean updateCountry(Country obj) {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
            em.close();
            return true;
	}

	@Override
	public Country getById(int id) {
                Country country=em.find(Country.class, id);
                em.close();
                return country;
	}

}
