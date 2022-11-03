package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;
@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO{
	private static final String GET_EMP_BY_EMP_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=? ";
	@Autowired
	JdbcTemplate jt;
	@Override
	public Employee getEmployeeByNo(int no) {
		Employee emp=jt.queryForObject(GET_EMP_BY_EMP_NO, new EmployeeRowMapper(),no);
		return emp;
	}
	static class EmployeeRowMapper implements RowMapper{
		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp=new Employee();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setSal(rs.getFloat(4));
			return emp;
		}
		
	}

}
