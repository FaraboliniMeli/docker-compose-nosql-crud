package br.com.marcello.NoSQLCrud.repository;

import br.com.marcello.NoSQLCrud.dto.AccountDto;
import br.com.marcello.NoSQLCrud.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AccountRepository extends MongoRepository<Account, String> {

    @Query("{ 'username' : ?0 }")
    List<Account> findByUsername(String username);

}
