package com.test.api.api.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    //Li posem el nom de la columna, que no segueix el camelCase
    @Column(name = "date_birth")
    private LocalDate dateBirth;

    public User(){

    }
    public User(Long id, String name, String email, LocalDate dateBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateBirth = dateBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }
}
