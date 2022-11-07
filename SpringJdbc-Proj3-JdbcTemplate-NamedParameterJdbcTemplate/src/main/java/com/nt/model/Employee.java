package com.nt.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
public class Employee implements Serializable {
	private int empno;
	private String ename;

	private String job;
	private float sal;
	/*
	 * public int getEmpno() { return empno; } public void setEmpno(int empno) {
	 * this.empno = empno; } public String getEname() { return ename; } public void
	 * setEname(String ename) { this.ename = ename; }
	 * 
	 * @Override public String toString() { return "Employee [empno=" + empno +
	 * ", ename=" + ename + ", job=" + job + ", sal=" + sal + "]"; } public String
	 * getJob() { return job; } public void setJob(String job) { this.job = job; }
	 * public float getSal() { return sal; } public void setSal(float sal) {
	 * this.sal = sal; }
	 */
}
