package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO empDAO;
	@Override
	public int fetchEmployeeCount() {
		int count=empDAO.getEmployeeCount();
		return count;
	}

}
