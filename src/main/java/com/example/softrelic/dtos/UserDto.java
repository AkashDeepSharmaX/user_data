package com.example.softrelic.dtos;

import com.example.softrelic.domain.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class UserDto {
    @Email(message = "Invalid email address")
    @NotEmpty(message = "Email can be not be empty")
    private  String email;
    @NotNull(message = "Username can not be null")
    private String username;
    private AddressDto addressDTO;
    @Positive(message = "age has to be a positive number")
    private int age;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public AddressDto getAddressDTO() {
        return addressDTO;
    }

    public void setAddressDTO(AddressDto addressDTO) {
        this.addressDTO = addressDTO;
    }

    public Address getAddress() {
        return null;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
