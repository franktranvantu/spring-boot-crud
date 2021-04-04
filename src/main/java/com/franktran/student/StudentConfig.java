package com.franktran.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

  @Bean
  public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
    return args -> {
      Student frank = new Student("Frank", "frank@gmail.com", LocalDate.of(1992, Month.SEPTEMBER, 12));
      Student henry = new Student("Henry", "henry@gmail.com", LocalDate.of(1984, Month.JANUARY, 21));
      Student bean = new Student("Bean", "bean@gmail.com", LocalDate.of(1984, Month.APRIL, 9));
      studentRepository.saveAll(List.of(frank, henry, bean));
    };
  }
}
