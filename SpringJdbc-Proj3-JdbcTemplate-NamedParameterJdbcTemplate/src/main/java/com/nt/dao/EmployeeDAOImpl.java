package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMP_COUNT_BY_SAL_RANGE="SELECT COUNT(*) FROM EMP WHERE SAL>=:min AND SAL<=:max";
	@Autowired
	NamedParameterJdbcTemplate njt;
	@Override
	public int getEmployeeCountBySalaryRange(float start,float end) {
		Map<String,Object> params=new HashMap<String,Object>();
		params.put("min",start);
		params.put("max", end);
		
		int count=njt.queryForObject(GET_EMP_COUNT_BY_SAL_RANGE,params,Integer.class);
		return count;
	}
}
