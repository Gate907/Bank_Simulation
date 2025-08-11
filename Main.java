package Accounts;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String nm=sc.next();
		System.out.println("Enter Account Number");
		long acc=sc.nextInt();
		
		Account a=new Account(acc, nm);
		System.out.println("---------Bank Services----------");
		int ch;
		do {
			System.out.println("1.Deposite Amount "+"\n"+
					"2.WithDraw Amount "+"\n"+"3.Check Transaction "+"\n"+
					"4.Check Balance "+"\n");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			System.out.println("--------- Bank Details ----------");
			switch (ch) {
			case 1:
				{
					System.out.println("Enter Your Amount");
					double amt=sc.nextInt();
					a.deposit(amt);
					break;
				}
			case 2:
				{
					System.out.println("Enter Your Amount");
					double amt=sc.nextInt();
					a.withdraw(amt);
					break;
				}
			case 3:
				{
					a.printTrans();
					break;
				}
			case 4:
				{
					double b=a.getBalance();
					System.out.println("Balance Are :"+b);
					break;
				}
				

			default:
				System.out.println("Invalid choice");
				break;
			}
		}while(ch!=5);
		
		
		
		
		
		
		
		
		
		
		
	}

}
