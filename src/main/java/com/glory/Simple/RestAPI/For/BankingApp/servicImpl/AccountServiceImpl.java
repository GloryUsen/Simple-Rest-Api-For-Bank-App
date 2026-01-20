package com.glory.Simple.RestAPI.For.BankingApp.servicImpl;

import org.springframework.stereotype.Service;

import com.glory.Simple.RestAPI.For.BankingApp.dto.AccountDto;
import com.glory.Simple.RestAPI.For.BankingApp.entity.Account;
import com.glory.Simple.RestAPI.For.BankingApp.mapper.AccountMapper;
import com.glory.Simple.RestAPI.For.BankingApp.repository.AccountRepository;
import com.glory.Simple.RestAPI.For.BankingApp.service.AccountService;

@Service

public class AccountServiceImpl implements AccountService{

    private AccountRepository accountRepository;
      public AccountServiceImpl (AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapDtoToEntityAccount(accountDto);
       Account savedAccount =  accountRepository.save(account);
        return AccountMapper.mapJpaEntityToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long accountId) {
        Account account = accountRepository.findById(accountId)
        .orElseThrow(() -> new RuntimeException("Account does not exist"));

      return AccountMapper.mapJpaEntityToAccountDto(account);

}

}
