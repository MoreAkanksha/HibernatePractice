package com.OneToOneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Question {

	@Id 
	@GeneratedValue(strategy =GenerationType.AUTO)
	int qid;
	String ques;
	
	
	public Answer getAnsid() {
		return ansid;
	}
	public void setAnsid(Answer ansid) {
		this.ansid = ansid;
	}
	@OneToOne(cascade = CascadeType.ALL)
	Answer ansid;
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Question(String ques) {
		super();
		this.ques = ques;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", ques=" + ques + ", ansid=" + ansid + "]";
	}
	
	
}
