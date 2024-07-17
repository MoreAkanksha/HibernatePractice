


package com.OneToManayMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int fid;
	String fname;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fid")
	List<FacultySubject> fsublist;
	
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(String fname) {
		super();
		this.fname = fname;
		
	}


	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public List<FacultySubject> getFsublist() {
		return fsublist;
	}

	public void setFsublist(List<FacultySubject> fsublist) {
		this.fsublist = fsublist;
	}

	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", fsublist=" + fsublist + "]";
	}
	
}
