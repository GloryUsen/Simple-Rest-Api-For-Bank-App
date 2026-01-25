package com.glory.Simple.RestAPI.For.BankingApp.mapper;

import com.glory.Simple.RestAPI.For.BankingApp.dto.AccountDto;
import com.glory.Simple.RestAPI.For.BankingApp.entity.Account;

public class AccountMapper {

    public static Account mapDtoToEntityAccount(AccountDto accountDto){
        // Converting the AccountDto into Account Jpa-Entity

        // Crating object of account entity
        Account account = new Account(
            // passing the dto values to account entity constructor
            // accountDto.getId(),
            // accountDto.getAccountHolderName(),
            // accountDto.getAccountBalance()

            accountDto.id(),
            accountDto.accountHolderName(),
            accountDto.accountBalance()
        );

            // then returning the account entity object
       return account;

    }

    // Writing A Method to convert Account Jpa-Entity to Account DTO.
    public static AccountDto mapJpaEntityToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
            account.getId(),
            account.getAccountHolderName(),
            account.getAccountBalance()
             );

        return accountDto;
    }
}
