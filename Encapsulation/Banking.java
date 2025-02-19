package Encapsulation;

import java.util.Scanner;


public class Banking {
	
	private String bankAccountNUmber;
	private double balance;
	
	 Banking(String acctnumber, double balance) {
		this.bankAccountNUmber=acctnumber;
		this.balance=balance;
	}
	public String AcctNUmber() {
		return bankAccountNUmber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void depositAmt(double amt) {
		if(amt>0) {
			balance += amt;
			System.out.println("Amt is deposited");
		}else {
			System.out.println("Amt is invalid");
		}
	}
	
	public void withDraw(double amt) {
		if(amt>0 && amt<=balance) {
			balance -= amt;
			System.out.println("The amt is withdrawed successfully");
		}else {
			System.out.println("There is insufficiant balance in the acct");
		}
	}

	public static void main(String[] args) {
	
		Scanner n1= new Scanner(System.in);
		System.out.println("enter the acct number");
		 String bankAccountNUmber=n1.nextLine();
		 
		 System.out.println("Enter the balance amt");
		 double balance= n1.nextDouble();
		 
		 
		
		Banking obj=new Banking(bankAccountNUmber,balance );
		
		obj.getBalance();
		System.out.println("Current balance"+ obj.getBalance());
		
		System.out.println("the the account to deposit");
		double depositAmount=n1.nextDouble();
		obj.depositAmt(depositAmount);
		System.out.println("updated balance is :"+ obj.getBalance());
		
		System.out.println("Enter the amount to be withdraw for acct");
		double WithDrawAmount=n1.nextDouble();
		obj.withDraw(WithDrawAmount);
		System.out.println("updated amt after withdraw is: "+ obj.getBalance());
	n1.close();

	}

}
