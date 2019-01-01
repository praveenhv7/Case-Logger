package com.infosys.insert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class InsertManager {
	
	public int insertToExcel(List<String> data)
	{
		
		
		
		InsertBean insBean=new InsertBean();
		insBean.setIncidentNumber(data.get(0));
		insBean.setCategory(data.get(1));
		insBean.setUrgency(data.get(2));
		insBean.setAssignedGroup(data.get(3));
		insBean.setIssueDesc(data.get(4));
		insBean.setActionTaken(data.get(5));
		insBean.setRoutedTo(data.get(6));
		insBean.setRouteReason(data.get(7));
		insBean.setUserName(data.get(8));
		insBean.setLoggedDate(new Date());
		
//		System.out.println();
//		System.out.println(insBean.getIncidentNumber());
//		System.out.println(insBean.getActionTaken());
//		System.out.println(insBean.getUserName());
		
		InsertService insServ=new InsertService();
		insServ.insertDataToExcel(insBean);
		
		return 0;
		
	}

}

