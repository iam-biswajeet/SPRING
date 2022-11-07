package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
@Service("empService")
public class EmployeeMgmtImplService implements IEmployeeMgmtService{
	@Autowired
	IEmployeeDAO empDAO;

	@Override
	public int fetchEmployeeCountBySalaryRange(float start, float end) {
		int count=empDAO.getEmployeeCountBySalaryRange(start, end);
		return count;
	}

}
