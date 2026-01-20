package com.glory.Simple.RestAPI.For.BankingApp.service;

import com.glory.Simple.RestAPI.For.BankingApp.dto.AccountDto;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);

}
