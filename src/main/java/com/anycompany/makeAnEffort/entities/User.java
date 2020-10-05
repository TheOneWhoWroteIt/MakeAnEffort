package com.anycompany.makeAnEffort.entities;

import lombok.Data;

@Data
public class User {

    private long id;
    private String name;
    private String login;
    private String password;
    private String email;
}
