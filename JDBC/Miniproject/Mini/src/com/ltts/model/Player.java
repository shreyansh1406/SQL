package com.ltts.model;
import java.util.Date;

public class Player {
	
private int Id;	
private String name;
private String skill;
private int numberOfMatches;
private Date date;

public Player(int id, String name, String skill, int numberOfMatches, Date date) {
	super();
	Id = id;
	this.name = name;
	this.skill = skill;
	this.numberOfMatches = numberOfMatches;
	this.date = date;
}

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSkill() {
	return skill;
}
public void setSkill(String skill) {
	this.skill = skill;
}
public int getNumberOfMatches() {
	return numberOfMatches;
}
public void setNumberOfMatches(int numberOfMatches) {
	this.numberOfMatches = numberOfMatches;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}


}




