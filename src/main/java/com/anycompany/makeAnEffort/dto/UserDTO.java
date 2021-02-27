package com.anycompany.makeAnEffort.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class UserDTO {

    @NotBlank
    private String name;
    @NotBlank
    @Length(min = 3, max = 12)
    private String login;
    @Email
    private String email;
    @NotBlank
    @Length(min = 6, max = 18)
    private String password;
    @NotBlank
    private String password_return;


}
