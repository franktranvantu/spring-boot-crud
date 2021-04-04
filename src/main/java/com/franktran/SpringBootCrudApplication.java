package com.franktran;

import com.franktran.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootCrudApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootCrudApplication.class, args);
  }

  @GetMapping
  public List<Student> hello() {
    return List.of(new Student(1L, "Frank", "frank@gmail.com", LocalDate.of(1992, Month.SEPTEMBER, 12), 28));
  }
}
