package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IStudentDAO;
import com.nt.model.Student;
@Service("stdService")
public class StudentMgmtServiceImpl implements IStudentMgmtService {
	@Autowired
	private IStudentDAO dao;
	@Override
	public String registerStudent(Student student) {
		int count=dao.insertStudent(student);
		return (count==0)?"Student not Registered":"Student Registered";
	}


}
