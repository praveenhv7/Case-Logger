package com.infosys.insert;

import java.util.Date;

public class InsertBean {
	String incidentNumber;
	String issueDesc;
	String actionTaken;
	String category;
	String assignedGroup;
	String urgency;
	String routedTo;
	String routeReason;
	String userName;
	Date loggedDate;
	
	public String getIncidentNumber() {
		return incidentNumber;
	}
	public void setIncidentNumber(String incidentNumber) {
		this.incidentNumber = incidentNumber;
	}
	public String getIssueDesc() {
		return issueDesc;
	}
	public void setIssueDesc(String issueDesc) {
		this.issueDesc = issueDesc;
	}
	public String getActionTaken() {
		return actionTaken;
	}
	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAssignedGroup() {
		return assignedGroup;
	}
	public void setAssignedGroup(String assignedGroup) {
		this.assignedGroup = assignedGroup;
	}
	public String getUrgency() {
		return urgency;
	}
	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}
	public String getRoutedTo() {
		return routedTo;
	}
	public void setRoutedTo(String routedTo) {
		this.routedTo = routedTo;
	}
	public String getRouteReason() {
		return routeReason;
	}
	public void setRouteReason(String routeReason) {
		this.routeReason = routeReason;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getLoggedDate() {
		return loggedDate;
	}
	public void setLoggedDate(Date loggedDate) {
		this.loggedDate = loggedDate;
	}
	
	

}
