package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answer_table")
public class Answer {
	@Id
	private int answer_id;
	private String answer;
	@OneToOne(mappedBy="answer")
	private Question question;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer(int answer_id, String answer) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
	}

	public int getAnswer_id() {
		return answer_id;
	}

	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
