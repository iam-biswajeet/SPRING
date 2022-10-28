package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface IEmployeeDAO {
	
	public int getEmployeeCount();
	public Map<String,Object>getEmployeeByEmpId(int no);
	public List<Map<String,Object>>getEmployeeByDesg(String desg1,String desg2);
	public double getEmployeeSalByEmpId(int no);

}
