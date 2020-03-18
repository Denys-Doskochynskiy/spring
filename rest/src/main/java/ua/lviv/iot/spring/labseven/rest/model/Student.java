package ua.lviv.iot.spring.labseven.rest.model;

public class Student {
private String firsStudent;
private String secondStudent;

public Student(String firstStudent,String secondStudent) {
	super();
	this.firsStudent =firstStudent;
	this.secondStudent= secondStudent;
}
public String getSecondStudent() {
	return secondStudent;
}
public void setSecondStudent(String secondStudent) {
	this.secondStudent = secondStudent;
}
public String getFirsStudent() {
	return firsStudent;
}
public void setFirsStudent(String firsStudent) {
	this.firsStudent = firsStudent;
}
}
