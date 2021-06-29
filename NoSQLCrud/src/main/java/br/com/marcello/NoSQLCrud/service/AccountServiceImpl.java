package br.com.marcello.NoSQLCrud.service;

import br.com.marcello.NoSQLCrud.model.Account;
import br.com.marcello.NoSQLCrud.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account saveAccount(Account account) {
        return this.accountRepository.save(account);
    }

    @Override
    public List<Account> getAllAccounts() {
        return this.accountRepository.findAll();
    }

    @Override
    public Account updateUsername(String username, String newUsername) {
        Account account = this.accountRepository.findByUsername(username).get(0);
        account.setUsername(newUsername);
        return this.accountRepository.save(account);
    }

    @Override
    public List<Account> findByUsername(String username) {
        return this.accountRepository.findByUsername(username);
    }

    @Override
    public void deleteAccount(String username) {
        this.accountRepository.delete(this.accountRepository.findByUsername(username).get(0));
    }
}
