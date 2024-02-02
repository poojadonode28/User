package com.LoginSystem1.LoginSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
    String name;
    int age;
    String username;
    String password;
    String token;

}
