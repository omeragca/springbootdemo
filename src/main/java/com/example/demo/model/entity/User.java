package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uuser")
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String role;

}
