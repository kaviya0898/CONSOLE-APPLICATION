package Bankingapp;
import java.util.*;
public class Mainpage {

	public static void main(String[] args) {
		Bankaccount bank=new Bankaccount();
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO XYZ BANK");
		
		
		boolean select=false;
		while(!select)
		{
			System.out.println("NEW USER? THEN REGISTER PRESS 1");
			System.out.println("EXISTING USER? THEN LOGIN PRESS 2");
			System.out.println("TO EXIT PLEASE PRESS 3");
			 int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			bank.Register();
			break;
		case 2:
			bank.Checkin();
			break;
		case 3:
			System.out.println("THANK YOU PLEASE VISIT AGAIN");
			select=true;
		   break;
		   default:
			   System.out.println("INVALID OPTION PLEASE SELECT FROM ABOVE OPTION ONLY");
			   break;
		}
		

	}

}
}
