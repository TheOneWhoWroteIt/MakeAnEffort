package com.anycompany.makeAnEffort.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@NoArgsConstructor
@Table(schema = "app", name = "user_app")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank
    @Column(name = "name", nullable = false, length = 128)
    private String name;

    @NotBlank
    @Column(name = "login", nullable = false, length = 128, unique = true)
    private String login;

    @NotBlank
    @Column(name = "password", nullable = false)
    private String password;

    @Email
    @Column(name = "email", nullable = false, length = 128)
    private String email;

    //@NotBlank
    @Column(name = "active", nullable = false)
    private boolean active;

    //@NotBlank
    @Column(name = "user_role", nullable = false)
    private Role USER_ROLE;

    public User(@NotBlank String name,
                @NotBlank String login,
                @NotBlank String password,
                @Email String email,
                /*@NotBlank*/ boolean active,
                /*@NotBlank*/ Role USER_ROLE) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.email = email;
        this.active = active;
        this.USER_ROLE = USER_ROLE;
    }

    /*@ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(schema = "app", name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;*/
}
