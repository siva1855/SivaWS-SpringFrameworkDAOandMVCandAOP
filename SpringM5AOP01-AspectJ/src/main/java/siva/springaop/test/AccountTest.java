package siva.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import siva.springaop.config.AccountAppConfiguration;
import siva.springaop.service.AccountService;

public class AccountTest {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AccountAppConfiguration.class);
		
		AccountService accountService = (AccountService) applicationContext.getBean("accountServiceImpl");
		
		accountService.deposit(12345L, 30000.00);

		System.out.println("= = = = = = = = = = = =");

		accountService.withdraw(98765L, 15000.00);

		System.out.println("= = = = = = = = = = = =");

		System.out.println("balance = " + accountService.getBalance(123456789L));
	}
}
