package Bankingapp;

public class AccountDetails
{
private String firstName;
private String lastName;
private String phonenumber;
private double balance=0.0;
public int deposit;
private String pin;
private double initialamount=0;
private String accId;


public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}
public String getAccId() {
	return accId;
}
public void setAccId(String accId) {
	this.accId = accId;
}
	public double getinitialamount()
	{
		return initialamount;
	}
	public void setInitialAmount(double initialamount)
	{
		this.initialamount=initialamount;
	}

	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
		this.deposit+=this.initialamount;
		
	}
 
 
 
 

	

}
