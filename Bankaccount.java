package Bankingapp;
import java.util.*;
public class Bankaccount {
	Random random=new Random();
	Scanner sc=new Scanner(System.in);
	ArrayList<AccountDetails> accounts=new ArrayList<>();
	ArrayList<Integer> number=new ArrayList<>();
  public void Register()
  { 
	 
	  AccountDetails accountDetails=new AccountDetails();
	  System.out.println("ENTER YOUR FIRST NAME:");
	  String firstName=sc.nextLine();
	  accountDetails.setFirstName(firstName);
	  System.out.println("ENTER YOUR LAST NAME");
	  String lastName=sc.nextLine();
	  accountDetails.setLastName(lastName);
	  System.out.println("ENTER YOUR PHONE NUMBER");
	 
	  String phoneNumber=sc.nextLine();
	  accountDetails.setPhonenumber(phoneNumber);
	  String pin="";
	  for(int i=0;i<4;i++)
	  {
		  pin=pin+random.nextInt(4);
		  
	  }
	  accountDetails.setPin(pin);
	   String accId="";
	   for(int i=0;i<4;i++)
	   {
		   accId=accId+random.nextInt(9);
	   }
	   accountDetails.setAccId(accId);
	   System.out.println("ENTER THE AMOUNT TO DEPOSIT MINIMUM RS.500");
	   double initialamount=sc.nextDouble();
	   accountDetails.setInitialAmount(initialamount);
	   accountDetails.setBalance(initialamount);
	  accounts.add(accountDetails);
	  System.out.println("YOU HAVE SUCCESSFULLY CREATED YOUR BANK ACCOUNT YOUR ACCOUNT NUMBER IS"+" "+accId);
	  System.out.println("YOUR PIN IS"+" "+pin+" "+"DONOT SHARE WITH ANYONE");
	  //System.out.println("GO TO MAIN MENU DEPOSIT MINIMUM 500");
	  System.out.println("REDIRECTING TO MAIN MENU");
  }
  public void Checkin()
  {
	  double nowWithdraw=0,nowDeposit=0;
	  System.out.println("ENTER YOUR ACCOUNT NUMBER");
	  String accId=sc.next();
	  System.out.println("ENTER YOUR PIN");
	  String pin=sc.next();
	  if(isCorrect(accId,pin)==true)
	  {
		  Details detail=new Details();
		  detail.mainMenu();
		  
		  
		  boolean yourchoice=false;
		  while(!yourchoice)
		  {
			  int choice=sc.nextInt();
			  switch(choice)
			  {
			  case 1:
				  System.out.println("ENTER THE AMOUNT TO DEPOSIT");
				  double deposit=sc.nextDouble();
				   nowDeposit = deposit;
				   deposit(deposit,accId);
				  System.out.println("REDIRECTING TO MAIN MENU");
				  detail.mainMenu();
				  break;
			  case 2:
				  System.out.println("ENTER THE AMOUNT TO WITHDRAWL");
				  double amountWithdraw=sc.nextDouble();
				  nowWithdraw=amountWithdraw;
				  withdraw(amountWithdraw,accId);
				  System.out.println("REDIRECTING TO MAIN MENU");
				  detail.mainMenu();
				  break;
			  case 3:
				  System.out.println("LAST DEPOSIT:"+""+nowDeposit);
				  System.out.println("LAST WITHDRAW:"+""+nowWithdraw);
				  System.out.println("REDIRECTING TO MAIN MENU");
				  detail.mainMenu();
				  break;
			  case 4:
				  yourchoice=true;
				  break;
			  }
		  }
		  
		  
	  }
	  else
	  {
		  System.out.println("LOGIN FAILED DUE TO INCORRECT INFORMATION");
		  System.out.println("REDIRCTING TO MAIN MENU");
	  }
  }

  public boolean isCorrect(String accId,String pin)
  {
	 for(AccountDetails acc:accounts)
	 {
		
		if((acc.getAccId().equals(accId))&&(acc.getPin().equals(pin)))
		 {
			 return true;
		 }
	 }
	 return false;
  }
  public void deposit(double deposit,String accId)
  {
  	for(int index=0;index<accounts.size();index++)
  	{
  		if(accounts.get(index).getAccId().equals(accId))
  		{
  			double p=accounts.get(index).getBalance()+deposit;
  			accounts.get(index).setBalance(p);
  			System.out.print("AVAILABEL BALANCE IS:");
  			System.out.println(accounts.get(index).getBalance());
  		}
  	}
  }
 public void withdraw(double amountWithdraw,String accId)
 {
	 for(int index=0;index<accounts.size();index++)
	  	{
	  		if(accounts.get(index).getAccId().equals(accId))
	  		{
	  			double p=accounts.get(index).getBalance()-amountWithdraw;
	  			accounts.get(index).setBalance(p);
	  			System.out.println("AMOUNT CAN BE WITHDRAWN");
	  			System.out.print("AVAILABEL BALANCE IS:");
	  			System.out.println(accounts.get(index).getBalance());
	  		}
	  	}
 }

  
  
}