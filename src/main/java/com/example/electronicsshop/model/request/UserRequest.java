package com.example.electronicsshop.model.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
//    @NotBlank(message = "Name cannot be blank")
//    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

//    @NotBlank(message = "Email cannot be blank")
//    @Email(message = "Email should be valid")
    private String email;

//    @NotBlank(message = "Phone number cannot be blank")
//    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
    private String phoneNumber;
//
//    @NotBlank(message = "Password cannot be blank")
//    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;
//
//    @NotBlank(message = "Confirm password cannot be blank")
//    @Size(min = 8, message = "Confirm password must be at least 8 characters")
    private String confirmPassword;
}
