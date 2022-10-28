package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO{
	private static final String GET_EMP_COUNT="SELECT COUNT(*) FROM EMP";
	private static final String GET_EMP_BY_EMPNO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN (?,?)";
	private static final String GET_EMP_SAL_BY_EMPNO="SELECT SAL FROM EMP WHERE EMPNO=?";
	
	@Autowired
	private JdbcTemplate jt;
	@Override
	public int getEmployeeCount() {
		int count=jt.queryForObject(GET_EMP_COUNT, Integer.class);
		return count;
	}
	@Override
	public List<Map<String, Object>> getEmployeeByDesg(String desg1, String desg2) {
		List<Map<String,Object>> list=jt.queryForList(GET_EMP_BY_DESG,desg1,desg2);
		return list;
	}
	@Override
	public Map<String, Object> getEmployeeByEmpId(int no) {
		Map<String,Object> map=jt.queryForMap(GET_EMP_BY_EMPNO,no);
		return map;
	}
	@Override
	public double getEmployeeSalByEmpId(int no) {
		double sal=jt.queryForObject(GET_EMP_SAL_BY_EMPNO,Double.class,no);
		return sal;
	}

}
