package Bankingapp;

public class WorkDetails 
{
	private double deposit;
	private double balance;
	public void deposit(double amount)
	 {
		 deposit+=amount;
		 System.out.println("AVAILABLE BALANCE IS "+" "+deposit);
	 }
	 public void withdraw(double amount)
	 {
		 if(deposit<amount)
		 {
			 System.out.println("INSUFFICIENT FUNDS");
		 }
		 else
		 {
			 System.out.println("AMOUNT CAN BE COLLECTED");
			 this.balance-=amount;
		 }
	 }
	 public void details()
	 {
		 System.out.println("NAME:"+" "+this.firstName+this.lastName);
		 System.out.println("PHONENUMBER:"+" "+this.phonenumber);
		 System.out.println("ACCOUNTNUMBER"+" "+this.pin);
		 System.out.println("AVAILABLE BALANCE"+" "+this.balance);
		 System.out.println("THANKYOU FOR VISITING");
	 }

}
