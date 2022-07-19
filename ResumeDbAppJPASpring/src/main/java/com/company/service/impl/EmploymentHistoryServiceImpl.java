package com.company.service.impl;

import com.company.dao.impl.EmploymentHistoryRepository;
import com.company.entity.EmploymentHistory;
import com.company.service.inter.EmploymentHistoryServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmploymentHistoryServiceImpl implements EmploymentHistoryServiceInter {

    @Autowired
    private EmploymentHistoryRepository employmentHistoryDao;

	@Override
	public List<EmploymentHistory> getAllEmploymentHistoryById(int id) {
		return employmentHistoryDao.getAllEmploymentHistoryById(id);
	}

	@Override
	public boolean addEmploymentHistory(EmploymentHistory obj) {
		        return employmentHistoryDao.addEmploymentHistory(obj);
	}

	@Override
	public boolean updateEmploymentHistory(EmploymentHistory obj) {
		return employmentHistoryDao.updateEmploymentHistory(obj);
	}

	@Override
	public boolean removeEmploymentHistory(int id) {
		return employmentHistoryDao.removeEmploymentHistory(id);
	}
	
}
