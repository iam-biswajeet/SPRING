package com.nt.sevice;

public class CensusService {
	public String exportData() {
		return "Data is exported";
	}
	public boolean isOdd(int no) {
		if(no%2==0)
			return false;
		else
			return true;
	}
	public boolean isEmpty(String user) {
		return user.isEmpty();
	}

}
