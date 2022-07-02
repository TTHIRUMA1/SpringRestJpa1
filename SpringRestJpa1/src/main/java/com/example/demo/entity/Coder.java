package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Coder {
	
	@Id
	@GeneratedValue
	private int cid;
	private String cname;
	private String tech;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Laptop> laptops;
	
	public List<Laptop> getLaptops(){
		return laptops;
	}
	
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Coder [cid=" + cid + ", cname=" + cname + ", tech=" + tech + "]";
	}
	}