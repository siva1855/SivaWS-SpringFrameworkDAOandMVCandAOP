package siva.springaop.serviceimpl;

import org.springframework.stereotype.Service;

import siva.springaop.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public void deposit(long accno, double amount) {
		System.out.println("deposit---> Amount deposited : " + amount);
	}

	@Override
	public void withdraw(long accno, double amount) {
		System.out.println("withdraw---> Amount withdrawn : " + amount);
	}

	@Override
	public double getBalance(long accno) {
		return 10000.0;
	}
}
