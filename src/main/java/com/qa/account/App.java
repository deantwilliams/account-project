package com.qa.account;

import com.qa.account.domain.Account;
import com.qa.account.service.AccountService;

public class App 
{
    public static void main( String[] args )
    {
        AccountService accountService = new AccountService();
        Account dean = new Account("Dean","Williams","00001");
        accountService.addAccountToMap(dean);
        
        accountService.retrieveSingleAccountAsAccount(1);
        System.out.println(accountService.retrieveSingleAccountAsString(1));
    }
}
