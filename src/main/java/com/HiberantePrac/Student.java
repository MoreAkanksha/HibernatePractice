package com.HiberantePrac;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id  //to set primary key to given column
	int stid;
	String stname;
	int RollNo;
	int age;

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getName() {
		return stname;
	}

	public void setName(String name) {
		this.stname = name;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int stid, String stname, int rollNo, int age) {
		super();
		this.stid = stid;
		this.stname = stname;
		RollNo = rollNo;
		this.age = age;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [stid=" + stid + ", name=" + stname + ", RollNo=" + RollNo + ", age=" + age + "]";
	}

}
