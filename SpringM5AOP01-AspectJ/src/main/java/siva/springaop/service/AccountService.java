package siva.springaop.service;

public interface AccountService {
	
	public void deposit(long accno, double amount);

	public void withdraw(long accno, double amount);

	public double getBalance(long accno);
}
