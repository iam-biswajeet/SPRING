package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Student;
import com.nt.service.IStudentMgmtService;
import com.nt.service.StudentMgmtServiceImpl;

public class SimpleJdbcInsertTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		IStudentMgmtService service=ctx.getBean(StudentMgmtServiceImpl.class);
		Student st=new Student();
		st.setSid(1003);
		st.setSname("Bapuni");
		st.setSadd("Badadanda");
		st.setAvg(24.99f);
		String msg=service.registerStudent(st);
		System.out.println(msg);
	}

}
