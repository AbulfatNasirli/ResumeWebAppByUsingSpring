package com.company.service.inter;

import com.company.entity.EmploymentHistory;

import java.util.List;

public interface EmploymentHistoryServiceInter {

	public List<EmploymentHistory> getAllEmploymentHistoryById(int id);
	
	public boolean addEmploymentHistory(EmploymentHistory obj);
	
	public boolean updateEmploymentHistory(EmploymentHistory obj);
	
	public boolean removeEmploymentHistory(int id);
	
	
}
