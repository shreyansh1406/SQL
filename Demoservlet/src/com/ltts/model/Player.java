package com.ltts.model;

import java.sql.Date;

public class Player {

	private int pid;
	private String name;
	private Date date;
	private int run;
	private int wic;
	private String country;
	public Player(int pid, String name, Date date, int run, int wic, String country) {
		super();
		this.pid = pid;
		this.name = name;
		this.date = date;
		this.run = run;
		this.wic = wic;
		this.country = country;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public int getWic() {
		return wic;
	}
	public void setWic(int wic) {
		this.wic = wic;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", name=" + name + ", date=" + date + ", run=" + run + ", wic=" + wic
				+ ", country=" + country + "]";
	}
	
	
	



	

	
	
	
}