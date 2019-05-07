package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {

        this.repository.save(new Employee("Elvis", "Presley", "singer"));
        this.repository.save(new Employee("Marilyn", "Monroe", "actress"));
        this.repository.save(new Employee("Robert", "Deniro", "actor"));
        this.repository.save(new Employee("Cezary", "Pazura", "actor"));
        this.repository.save(new Employee("Boguslaw", "Linda", "actor"));
        this.repository.save(new Employee("Jennifer", "Lopez", "singer"));
    }
}
