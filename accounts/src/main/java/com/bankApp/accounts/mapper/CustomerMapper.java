package com.bankApp.accounts.mapper;

import com.bankApp.accounts.dto.CustomerDto;
import com.bankApp.accounts.entity.Customer;

public class CustomerMapper {

    public static CustomerDto mapToCustomerDto(Customer entity, CustomerDto dto){
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        dto.setMobileNumber(entity.getMobileNumber());
        return dto;
    }

    public static Customer mapToCustomer(CustomerDto dto, Customer entity){
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setMobileNumber(dto.getMobileNumber());
        return entity;
    }

}
