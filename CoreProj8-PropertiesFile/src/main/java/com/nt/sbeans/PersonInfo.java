package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("per")
@PropertySource("com/nt/commons/info.properties")
public final  class PersonInfo {
	@Value("${per.name}")
	private String pname;
	@Value("${per.age}")
	private int page;
	@Value("${per.addrs}")
	private String paddrs;
	@Override
	public String toString() {
		return "PersonInfo [pname=" + pname + ", page=" + page + ", paddrs=" + paddrs + "]";
	}
	

}
