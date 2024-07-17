package com.OneToManayMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class FacultySubject {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int subid;
	String subjectName;
	public FacultySubject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FacultySubject(String subjectName) {
		super();
		this.subjectName = subjectName;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	@Override
	public String toString() {
		return "FacultySubject [subid=" + subid + ", subjectName=" + subjectName + "]";
	}
	
	
}
