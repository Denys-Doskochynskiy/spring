package ua.lviv.iot.spring.labseven.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.spring.labseven.rest.model.Student;

@RequestMapping("/students")
@RestController
public class StudentsController {

  @GetMapping(path = "/{id}")
  public Student getStudent(@PathVariable("id") Integer studentId) {
    System.out.println(studentId);
    return new Student("Maria", "vasa");
  }

  @RequestMapping(method = { RequestMethod.GET, RequestMethod.PUT }, path = "/smartest")
  public Student getSmartestStudents() {
    return null;
  }

}