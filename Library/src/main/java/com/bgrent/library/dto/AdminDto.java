package com.bgrent.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminDto {
    @Size(min=3, max = 20, message = "Invalid first name!")
    private String firstName;
    @Size(min=3, max = 20, message = "Invalid last name!")
    private String lastName;

    private String username;
    @Size(min=3, max = 30, message = "Password is to short!")
    private String password;

    private String repeatPassword;
}
