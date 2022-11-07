package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDAO {
	public int getEmployeeCountBySalaryRange(float start,float end);
	}
