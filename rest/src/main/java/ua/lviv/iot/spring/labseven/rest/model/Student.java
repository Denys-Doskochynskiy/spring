package ua.lviv.iot.spring.labseven.rest.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.http.ResponseEntity.HeadersBuilder;

public class Student {
	private String firsStudent;
	private String secondStudent;
	private Integer id;

	public Student(String firstStudent, String secondStudent) {
		super();
		// this.id=id;
		this.firsStudent = firstStudent;
		this.secondStudent = secondStudent;
	}

	public Student() {
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
}
