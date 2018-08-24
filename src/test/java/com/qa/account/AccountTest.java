package com.qa.account;

import static org.junit.Assert.*;

import org.junit.*;

import com.qa.account.domain.Account;
import com.qa.account.service.AccountService;

public class AccountTest {

	private static AccountService service;
	
	@BeforeClass
	public static void setupClass()
	{
		service = new AccountService();
		Account deanWilliams = new Account("Dean","Williams","00001");
        service.addAccountToMap(deanWilliams);
        Account aronEdwards = new Account("Aron","Edwards","00002");
        service.addAccountToMap(aronEdwards);
        Account dickieChester = new Account("Dickie","Chester","00003");
        service.addAccountToMap(dickieChester);
        Account deanMartin = new Account("Dean","Martin","00004");
        service.addAccountToMap(deanMartin);
        Account davidJones = new Account("David","Jones","00005");
        service.addAccountToMap(davidJones);
        Account deanMarley = new Account("Dean","Marley","00006");
        service.addAccountToMap(deanMarley);
	}
	
	@Test
	public void NumberOfUsersInMap_Test() {
		String searchFirstName = "Dean";
		int nameCount = service.FindNumberOfFirstName(searchFirstName);
		assertEquals(3,nameCount);
	}

}
