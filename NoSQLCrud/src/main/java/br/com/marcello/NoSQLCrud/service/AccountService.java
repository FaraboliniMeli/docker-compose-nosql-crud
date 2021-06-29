package br.com.marcello.NoSQLCrud.service;

import br.com.marcello.NoSQLCrud.model.Account;

import java.util.List;

public interface AccountService {

    Account saveAccount(Account account);

    List<Account> getAllAccounts();

    Account updateUsername(String username, String newUsername);

    List<Account> findByUsername(String username);

    void deleteAccount(String username);

}
