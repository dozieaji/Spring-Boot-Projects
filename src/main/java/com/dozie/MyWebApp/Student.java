package com.dozie.MyWebApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int aid;
	private String aname;
	
	



	public int getAid() {
		return aid;
	}
	
	
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}





	@Override
	public String toString() {
		return "Student [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}


	public String getTech() {
		return tech;
	}


	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	
}
