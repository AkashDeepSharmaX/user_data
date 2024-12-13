package com.example.softrelic.controller;

import com.example.softrelic.service.AddressService;
import com.example.softrelic.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    public AddressService addressService;
    @PostMapping("/")
    public Address create(@RequestBody Address address) {
        return addressService.create(address);
    }
}
