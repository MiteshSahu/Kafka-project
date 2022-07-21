package com.example.kafkaexample.model;

public class User {
    private String name;
    private String debt;
    private Long salary;;

    public User(String name, String debt, Long salary) {
        this.name = name;
        this.debt = debt;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDebt() {
        return debt;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
