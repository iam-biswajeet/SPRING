package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;
@Service("empService")
public class EmployeeMgmtImplService implements IEmployeeMgmtService{
	@Autowired
	IEmployeeDAO empDAO;
	@Override
	public Employee fetchEmployeeByNo(int no) {
		Employee emp=empDAO.getEmployeeByNo(no);
		return emp;
		
	}
	@Override
	public List<Employee> fetchEmployeeDetailsByDesg(String desg) {
		return empDAO.getEmployeesByDesg(desg);
	}

}
