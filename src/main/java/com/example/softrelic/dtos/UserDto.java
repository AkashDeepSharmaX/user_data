package com.example.softrelic.dtos;

import com.example.softrelic.domain.Address;

public class UserDto {
    private  String email;
    private String username;
    private AddressDto addressDTO;


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
}
