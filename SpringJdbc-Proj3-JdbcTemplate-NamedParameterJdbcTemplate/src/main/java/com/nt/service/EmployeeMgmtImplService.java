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
	public int fetchEmployeeCountBySalaryRange(float start, float end) {
		int count=empDAO.getEmployeeCountBySalaryRange(start, end);
		return count;
	}

	@Override
	public List<Employee> fetchEmpsByDesg(String desg1, String desg2) {
		
		return empDAO.getEmpsByDesg(desg1, desg2);
	}

	@Override
	public String registerEmployee(Employee emp) {
		int count=empDAO.insertEmployee(emp);
		return (count==0)?"employee not registered":"Employee registered";
	}

}
