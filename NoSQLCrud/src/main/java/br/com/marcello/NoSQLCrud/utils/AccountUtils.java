package br.com.marcello.NoSQLCrud.utils;

import br.com.marcello.NoSQLCrud.dto.AccountDto;
import br.com.marcello.NoSQLCrud.model.Account;

public interface AccountUtils {

    Account convertDtoToEntity(AccountDto accountDto);

}
