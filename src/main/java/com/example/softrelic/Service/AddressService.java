package com.example.softrelic.Service;

import com.example.softrelic.Repository.AddressRepository;
import com.example.softrelic.domain.Address;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address create(Address address) {
        return addressRepository.save(address);
    }
}
