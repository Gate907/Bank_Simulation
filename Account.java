package Accounts;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private double balance;
	private long accNum;
	private String HolderNm;
	List<String> trans=new ArrayList<String>();
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account( long accNum, String holderNm) {
		super();
		
		this.accNum = accNum;
		HolderNm = holderNm;
	}
	
	public void deposit(double amount) {
		if(amount >0) {
			balance+=amount;
			trans.add("Deposited :"+amount+" | New Balance :"+balance);
			System.out.println("Available Balance :"+balance);
		}else {
			System.out.println("Amount Should be Positive...");
		}
	}
	
	
	
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient Balance ....");
		
		}else if(amount<balance) {
			balance-=amount;
			trans.add("WithDrawed :"+amount+" | New Balance :"+balance);
			System.out.println("Available Balance :"+balance);
		}else {
			System.out.println("Amount Should be Positive...");
		}
	}
	
	
	public void printTrans() {
		for(String s:trans) {
			System.out.println(s);
		}
		System.out.println("=================================================================\n");
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	
}
