package com.example.demo.Model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class QuestionModel 
{

	@Id
	private int qno;
	private String qname;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private AnswerModel ans;

	public int getQno() {
		return qno;
	}

	public void setQno(int qno) {
		this.qno = qno;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public AnswerModel getAns() {
		return ans;
	}

	public void setAns(AnswerModel ans) {
		this.ans = ans;
	}

	
	
	
	
}
