package com.zia.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Concluidos {
	
	@Id 
	long id;
	
	int d1;
	int d2;
	int d3;
	int d4;
	int d5;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getD1() {
		return d1;
	}
	public void setD1(int d1) {
		this.d1 = d1;
	}
	public int getD2() {
		return d2;
	}
	public void setD2(int d2) {
		this.d2 = d2;
	}
	public int getD3() {
		return d3;
	}
	public void setD3(int d3) {
		this.d3 = d3;
	}
	public int getD4() {
		return d4;
	}
	public void setD4(int d4) {
		this.d4 = d4;
	}
	public int getD5() {
		return d5;
	}
	public void setD5(int d5) {
		this.d5 = d5;
	}
	
	
}
