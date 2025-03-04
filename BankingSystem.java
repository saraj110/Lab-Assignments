package banking;

import util.PinValidator;

public class BankingSystem{

	
	 public static final String storedAccountNumber="ECE1256";
	 public static final String storedPin="1967";
	 
	
	public static class LoginProcessor{
   
	    public static boolean authenticate(String accountNumber, String pin){
		
		if ( accountNumber.equals(storedAccountNumber) && new PinValidator().new Rules().isValid(pin)){

			System.out.println(" Account name and Pin are valid.");
			return true;
			}
		else{
 			
			System.out.println(" Account and Pin are not valid. Enter again!");
			return false;
		}		
		}

	}


}