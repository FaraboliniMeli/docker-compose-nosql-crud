package br.com.marcello.NoSQLCrud.controller;

import br.com.marcello.NoSQLCrud.dto.AccountDto;
import br.com.marcello.NoSQLCrud.dto.UpdateUsernameDto;
import br.com.marcello.NoSQLCrud.service.AccountService;
import br.com.marcello.NoSQLCrud.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountUtils accountUtils;

    @PostMapping("/save")
    public ResponseEntity<?> saveAccount(@RequestBody AccountDto accountDto) {
        return new ResponseEntity<>(this.accountService.saveAccount(this.accountUtils.convertDtoToEntity(accountDto)),
                HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllAcconts() {
        return new ResponseEntity<>(this.accountService.getAllAccounts(), HttpStatus.OK);
    }

    @GetMapping("/{username}/get")
    public ResponseEntity<?> getAccountByUsername(@PathVariable(value = "username") String username){
        return new ResponseEntity<>(this.accountService.findByUsername(username), HttpStatus.OK);
    }

    @PatchMapping("{username}/update")
    public ResponseEntity<?> updateAccountUsername(@PathVariable(value = "username") String username,
                                                   @RequestBody UpdateUsernameDto updateUsernameDto){
        return new ResponseEntity<>(this.accountService.updateUsername(username, updateUsernameDto.getNewUsername()),
                HttpStatus.OK);
    }

    @DeleteMapping("{username}/delete")
    public void deleteAccount(@PathVariable(value = "username") String username) {
        this.accountService.deleteAccount(username);
    }

}
