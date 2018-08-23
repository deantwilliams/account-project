package com.qa.account;

import com.qa.account.domain.Account;
import com.qa.account.service.AccountService;
import com.qa.account.utils.JSONConvert;

public class App 
{
    public static void main( String[] args )
    {
        AccountService accountService = new AccountService();
        Account dean = new Account("Dean","Williams","00001");
        accountService.addAccountToMap(dean);
        Account aron = new Account("Aron","Edwards","00002");
        accountService.addAccountToMap(aron);
        Account dickie = new Account("Dickie","Chester","00003");
        accountService.addAccountToMap(dickie);
        
        accountService.retrieveSingleAccountAsAccount(1);
        System.out.println(accountService.retrieveSingleAccountAsString(1));
        System.out.println(JSONConvert.objectToJSONPretty(accountService.getAccountMap()));
    }
}
