package org.sid.bank_account_service.web;

import org.sid.bank_account_service.entities.BankAccount;
import org.sid.bank_account_service.repositories.BankAccountRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BankAccountGraphQLController {
    private BankAccountRepository accountRepository;

    public BankAccountGraphQLController(BankAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @QueryMapping
    public List<BankAccount> accountsList() {
        return accountRepository.findAll();
    }

    @QueryMapping
    public BankAccount accountById(@Argument String id) {
        return accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Account not found"));
    }
}
