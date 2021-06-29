package br.com.marcello.NoSQLCrud.utils;

import br.com.marcello.NoSQLCrud.dto.AccountDto;
import br.com.marcello.NoSQLCrud.model.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountUtilsImpl implements AccountUtils {

    @Override
    public Account convertDtoToEntity(AccountDto accountDto) {
        Account account = new Account();
        account.setUsername(accountDto.getUsername());
        account.setPassword(accountDto.getPassword());

        return account;
    }
}
