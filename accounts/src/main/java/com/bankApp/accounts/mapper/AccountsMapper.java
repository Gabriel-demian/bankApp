package com.bankApp.accounts.mapper;

import com.bankApp.accounts.dto.AccountsDto;
import com.bankApp.accounts.entity.Accounts;

public class AccountsMapper {

    public static AccountsDto mapToAccountsDto(Accounts entity, AccountsDto dto){
        dto.setAccountNumber(entity.getAccountNumber());
        dto.setAccountType(entity.getAccountType());
        dto.setBranchAddress(entity.getBranchAddress());
        return dto;
    }

    public static Accounts mapToAccounts(AccountsDto dto, Accounts entity){
        entity.setAccountNumber(dto.getAccountNumber());
        entity.setAccountType(dto.getAccountType());
        entity.setBranchAddress(dto.getBranchAddress());
        return entity;
    }

}
