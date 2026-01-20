package com.glory.Simple.RestAPI.For.BankingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glory.Simple.RestAPI.For.BankingApp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
