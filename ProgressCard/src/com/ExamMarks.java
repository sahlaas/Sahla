package com;

import java.io.Serializable;

public class ExamMarks implements Serializable {

	private static final long serialVersionUID = 1L;
	int examId;
	int rollNo;
	String name;
	int subject1;
	int subject2;
	int subject3;
	int subject4;
	int totalMark;
	float avgMark;
	public ExamMarks(int examId, int rollNo, String name, int subject1, int subject2, int subject3, int subject4,
			int totalMark, float avgMark) {
		super();
		this.examId = examId;
		this.rollNo = rollNo;
		this.name = name;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.totalMark = totalMark;
		this.avgMark = avgMark;
	}
	public ExamMarks(int examId, int rollNo, String name, int subject1, int subject2, int subject3, int subject4) {
		super();
		this.examId = examId;
		this.rollNo = rollNo;
		this.name = name;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
	}
	
	public ExamMarks(int rollNo, String name, int subject1, int subject2, int subject3, int subject4, int totalMark,
			float avgMark) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.totalMark = totalMark;
		this.avgMark = avgMark;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSubject1() {
		return subject1;
	}
	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}
	public int getSubject2() {
		return subject2;
	}
	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}
	public int getSubject3() {
		return subject3;
	}
	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}
	public int getSubject4() {
		return subject4;
	}
	public void setSubject4(int subject4) {
		this.subject4 = subject4;
	}
	public int getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(int totalMark) {
		this.totalMark = totalMark;
	}
	public float getAvgMark() {
		return avgMark;
	}
	public void setAvgMark(float avgMark) {
		this.avgMark = avgMark;
	}

	

	

}
