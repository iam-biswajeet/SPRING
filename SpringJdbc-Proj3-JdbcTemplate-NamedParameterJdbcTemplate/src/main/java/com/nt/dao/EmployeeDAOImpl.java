package com.nt.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMP_COUNT_BY_SAL_RANGE="SELECT COUNT(*) FROM EMP WHERE SAL>=:min AND SAL<=:max";
	private static final String GET_EMPS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(:desg1,:desg2) ORDER BY JOB";
	private static final String INSERT_EMP_QUERY="INSERT INTO EMP (EMPNO,ENAME,JOB,SAL) VALUES(:empno,:ename,:job,:sal)";
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
	@Override
	public List<Employee> getEmpsByDesg(String desg1, String desg2) {
		MapSqlParameterSource source=new MapSqlParameterSource();
		source.addValue("desg1", desg1);
		source.addValue("desg2", desg2);
		List<Employee> empsList=njt.query(GET_EMPS_BY_DESG, source,(ResultSet rs)->{
			List<Employee> list =new ArrayList<Employee>();
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setEmpno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setSal(rs.getFloat(4));
				list.add(emp);
			}
			return list;
		});
		return empsList;
	}
	@Override
	public int insertEmployee(Employee emp) {
		BeanPropertySqlParameterSource bpsps=new BeanPropertySqlParameterSource(emp);
		int count=njt.update(INSERT_EMP_QUERY,bpsps );
		return count;
	}
}
