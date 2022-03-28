package com.example.demospring.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "maria.jamal@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 5),
                    20
            );
            Student alex = new Student(
                    "Mariam",
                    "maria.jamal@gmail.com",
                    LocalDate.of(1998, Month.APRIL, 4),
                    23
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
