package com.nt.service;

import java.util.List;
import java.util.Map;

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
	@Override
	public List<Map<String, Object>> fetchEmployeeByEmpDesg(String desg1, String desg2) {
		List<Map<String,Object>> list=empDAO.getEmployeeByDesg(desg1, desg2);
		return list;
	}
	@Override
	public Map<String, Object> fetchEmployeeByEmpNo(int no) {
		Map<String,Object> map=empDAO.getEmployeeByEmpId(no);
		return map;
	}
	@Override
	public double fetchEmployeeSalByEmpNo(int no) {
		double sal=empDAO.getEmployeeSalByEmpId(no);
		return sal;
	}
	@Override
	public String hikeEmployeeSalaryByDesg(double percentage, String desg) {
		int count=empDAO.updateEmployeeSalaryByDesg(percentage, desg);
		return (count==0)?"No Employee salary is requiired for updation":count+" no of employee salary is updated";
	}
	@Override
	public String registerEmployee(String ename, String desg, double salary) {
		int count=empDAO.insertEmployee(ename, desg, salary);
		return (count==0)?"Employee Not Registered":"Employee  Registration Successful";
	}
	@Override
	public String terminateEmployeeBySalaryRange(double start, double end) {
		int count=empDAO.deleteEmployeeBySalaryRange(start, end);
		return (count==0)?"No employee is terminated":count+"  No of employee is Terminated";
	}

}
