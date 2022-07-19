package com.company.dao.impl;

import com.company.entity.EmploymentHistory;

import java.util.List;

public interface EmploymentHistoryRepositoryCustom {

	public List<EmploymentHistory> getAllEmploymentHistoryById(int id);
	
	public boolean addEmploymentHistory(EmploymentHistory obj);
	
	public boolean updateEmploymentHistory(EmploymentHistory obj);
	
	public boolean removeEmploymentHistory(int id);
	
	
}
