package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.model.Student;
@Repository("stdDAO")
public class StudentDAOImpl implements IStudentDAO{
	@Autowired
	private SimpleJdbcInsert sji;

	@Override
	public int insertStudent(Student student) {
		sji.setTableName("STUDENT");
		BeanPropertySqlParameterSource bpsps=new BeanPropertySqlParameterSource(student);
		int count=sji.execute(bpsps);
		return count;
	}

	/*
	 * @Override public int insertStudent(Student student) {
	 * sji.setTableName("STUDENT"); MapSqlParameterSource source=new
	 * MapSqlParameterSource(); source.addValue("sid", student.getSid());
	 * source.addValue("sname",student.getSname()); source.addValue("sadd",
	 * student.getSname()); source.addValue("avg", student.getAvg()); int
	 * count=sji.execute(source); return count;
	 * 
	 * }
	 */

	/*
	 * @Override public int insertStudent(Student student) {
	 * sji.setTableName("STUDENT"); Map<String,Object>map=new HashMap();
	 * map.put("sid",student.getSid()); map.put("sname",student.getSname());
	 * map.put("sadd",student.getSadd()); map.put("avg",student.getAvg()); int
	 * count=sji.execute(map); return count;
	 * 
	 * }
	 */
	

}
