package com.qa.account.service;

import java.util.HashMap;
import java.util.Map;

import com.qa.account.domain.Account;

public class AccountService {
	private Map<Integer,Account> accountMap;
	private int counter = 1;
	
	public AccountService()
	{
		accountMap = new HashMap<Integer,Account>();
	}
	
	public void addAccountToMap(Account accountToAdd)
	{
		accountMap.put(counter,accountToAdd);
		counter++;
	}
	
	public String retrieveSingleAccountAsString(int indexOfAccount)
	{
		return accountMap.get(indexOfAccount).toString();
	}
	
	public Account retrieveSingleAccountAsAccount(int indexOfAccount)
	{
		return accountMap.get(indexOfAccount);
	}

	public Map<Integer, Account> getAccountMap() {
		return accountMap;
	}

	public int FindNumberOfFirstName(String searchFirstName) {
		
		return (int) accountMap.values().stream().filter(each -> each.getFirstName().toLowerCase().equals(searchFirstName.toLowerCase())).count();
		
		//		int nameCounter = 0;
//		for(Account account : accountMap.values())
//		{
//			if(account.getFirstName().toLowerCase().equals(searchFirstName.toLowerCase()))
//			{
//				nameCounter++;
//			}
//		}
//		return nameCounter;
	}
	
	
}
