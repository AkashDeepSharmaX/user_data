package com.example.softrelic.service;

import com.example.softrelic.dtos.UserDto;
import com.example.softrelic.repository.AddressRepository;
import com.example.softrelic.repository.UserRepository;
import com.example.softrelic.domain.Address;
import com.example.softrelic.domain.User;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Service;
import com.example.softrelic.dtos.UserDto;


@Service
public class UserService {
    private final AddressRepository addressRepository;
    private final UserRepository userRepository;
    public UserService(AddressRepository addressRepository, UserRepository userRepository ) {
        this.addressRepository = addressRepository;
        this.userRepository = userRepository;
    }

    public User createUser(UserDto userDto) {
        Address address = new Address();
        address.setStreet(userDto.getAddressDTO().getStreet());
        address.setCity(userDto.getAddressDTO().getCity());
        address.setZipCode(userDto.getAddressDTO().getZipcode());
        address.setCountry(userDto.getAddressDTO().getCountry());

        Address savedAddress = addressRepository.save(address);

        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setUsername(userDto.getUsername());
        user.setAddress(savedAddress);

        return userRepository.save(user);
    }

    }

