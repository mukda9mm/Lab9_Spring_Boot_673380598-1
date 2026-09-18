package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public void createAccount(Account account){
        accountRepository.save(account);
    }
    public Account findAccountById(Long id){
        return accountRepository.findById(id).orElse(null);
    }
}
