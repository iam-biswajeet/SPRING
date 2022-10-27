package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO{
	private static final String GET_EMP_COUNT="SELECT COUNT(*) FROM EMP";
	@Autowired
	private JdbcTemplate jt;
	@Override
	public int getEmployeeCount() {
		int count=jt.queryForObject(GET_EMP_COUNT, Integer.class);
		return count;
	}

}
