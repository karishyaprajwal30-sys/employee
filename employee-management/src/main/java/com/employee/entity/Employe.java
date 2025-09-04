package com.employee.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role;
    private double salary;

    // Constructors
    public Employe() {}

    public Employe(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}
