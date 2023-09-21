package com.bankApp.accounts.service;

import com.bankApp.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Accounts Details based on given mobile number
     */
    CustomerDto fetchAccount(String mobileNumber);

}
