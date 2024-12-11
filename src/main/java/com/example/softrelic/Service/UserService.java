package com.example.softrelic.Service;

import com.example.softrelic.Repository.AddressRepository;
import com.example.softrelic.Repository.UserRepository;
import com.example.softrelic.domain.Address;
import com.example.softrelic.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Service
public class UserService {
    private final AddressService addressService;
    private final UserRepository userRepository;

    public UserService(AddressService addressService, UserRepository userRepository) {
        this.addressService = addressService;
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        if (user.getAddress() != null) {
            Address savedAddress = addressService.create(user.getAddress());
            user.setAddress(savedAddress);
        }
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
