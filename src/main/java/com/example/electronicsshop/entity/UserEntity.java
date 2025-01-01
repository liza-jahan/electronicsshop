package com.example.electronicsshop.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity  extends BaseEntity{
    private  String name;
    private  String email;
    private  String phoneNumber;
    private  String password;
    private  String confirmPassword;


}
