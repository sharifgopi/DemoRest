package com.test.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private String sRollNo;

	private String sName;

	private String sBranch;

	private String sCity;

	public Student(String sRollNo, String sName, String sBranch, String sCity) {
		this.sRollNo = sRollNo;
		this.sName = sName;
		this.sBranch = sBranch;
		this.sCity = sCity;
	}

	public Student() {
	}

	public void setsRollNo(String sRollNo) {
		this.sRollNo = sRollNo;
	}

	public String getsRollNo() {
		return sRollNo;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsName() {
		return sName;
	}

	public void setsBranch(String sBranch) {
		this.sBranch = sBranch;
	}

	public String getsBranch() {
		return sBranch;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}

	public String getsCity() {
		return sCity;
	}

	@Override
	public String toString() {
		return "sRollNo :" + sRollNo + "sName :" + sName + "sBranch :" + sBranch + "sCity :" + sCity;
	}

}
