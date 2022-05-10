package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

//            Student ronald = new Student(
//                    "ronald",
//                    LocalDate.of(2001, Month.DECEMBER, 11),
//                    "ronald@gmail.com");
//
//            Student alex = new Student(
//                    "alex",
//                    LocalDate.of(2002, Month.JANUARY, 24),
//                    "alex@gmail.com");
//
//            Student mary = new Student(
//                    "mary",
//                    LocalDate.of(2000, Month.APRIL, 06),
//                    "mary@gmail.com");
//
//            repository.saveAll(
//                    List.of(ronald,alex,mary)
//            );

            repository.findAll();
        };
    }
}
