package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
	public Employee fetchEmployeeByNo(int no);
	public List<Employee>fetchEmployeeDetailsByDesg(String desg);

}
