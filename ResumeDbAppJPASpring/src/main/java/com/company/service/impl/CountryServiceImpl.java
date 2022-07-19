package com.company.service.impl;

import com.company.dao.impl.CountryRepository;
import com.company.entity.Country;
import com.company.service.inter.CountryServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CountryServiceImpl implements CountryServiceInter {

    @Autowired
    private CountryRepository countryDao;

	@Override
	public List<Country> getAllCountry() {
		      return countryDao.getAllCountry();
	}

	@Override
	public boolean addCountry(Country obj) {
         return countryDao.addCountry(obj);
	}

	@Override
	public boolean updateCountry(Country obj) {
		   return countryDao.updateCountry(obj);
	}

	@Override
	public Country getById(int id) {
		return countryDao.getById(id);
	}

}
