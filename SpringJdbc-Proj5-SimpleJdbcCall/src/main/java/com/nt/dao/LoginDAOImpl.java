package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
/*create or replace procedure p_auth(user in varchar2,pass in varchar2,result out varchar2)
as
cnt number(4);
begin
select count(*)  into cnt from userinfo where uname=user and pwd=pass;
if(cnt=1) then
 result:='Login successful';
else
result:='Login denied';
end if;
end;*/
@Repository("loginDAO")
public class LoginDAOImpl implements ILoginDAO {
	@Autowired
	SimpleJdbcCall sjc;

	@Override
	public String authenticate(String username, String password) {
		sjc.setProcedureName("P_AUTH");
		Map<String,Object> inParams=new HashMap();
		inParams.put("user",username);
		inParams.put("pass",password);
		Map<String,Object> outParams=sjc.execute(inParams);
		String result=(String)outParams.get("RESULT");
		return result;
		
		
	}

}
