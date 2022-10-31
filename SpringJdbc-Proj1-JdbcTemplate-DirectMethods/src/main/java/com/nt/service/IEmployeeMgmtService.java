package com.nt.service;

import java.util.List;
import java.util.Map;

public interface IEmployeeMgmtService {
	public int fetchEmployeeCount();
	public List<Map<String,Object>>fetchEmployeeByEmpDesg(String desg1,String desg2);
	public Map<String,Object>fetchEmployeeByEmpNo(int no);
	public double fetchEmployeeSalByEmpNo(int no);
	public String registerEmployee(String ename,String desg,double salary) ;
	public String hikeEmployeeSalaryByDesg(double percentage,String desg);
	public String terminateEmployeeBySalaryRange(double start,double end);

}
