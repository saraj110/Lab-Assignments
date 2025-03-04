package main;

import java.io.Console;
import banking.BankingSystem;

public class BankApplication{


	public static void main(String args[]){

 		Console console=System.console();
		if (console==null){
			System.out.println("It is not available.");
			}

		String userAccNo=console.readLine("Enter Account number:");
		String userPin=console.readLine("Enter pin:");
		 

		boolean verified= BankingSystem.LoginProcessor.authenticate(userAccNo,userPin);

		if(verified){
				System.out.println("You have been granted access!");
			}
		else{
				System.out.println("You have been denied access!");
		}
		}








}