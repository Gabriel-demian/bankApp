package com.bankApp.accounts.service.impl;

import com.bankApp.accounts.dto.CustomerDto;
import com.bankApp.accounts.repository.AccountsRepository;
import com.bankApp.accounts.repository.CustomerRepository;
import com.bankApp.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

    }

}
