package com.franktran.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

  public List<Student> getStudents() {
    return List.of(new Student(1L, "Frank", "frank@gmail.com", LocalDate.of(1992, Month.SEPTEMBER, 12), 28));
  }
}
