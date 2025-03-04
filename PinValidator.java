package util;

import banking.BankingSystem;
public class PinValidator{


 	public class Rules{

		public boolean isValid(String pin){

		if (pin.length()==4 && pin.matches("%d")){
                    
			return  true;
		                                         }
		return pin.equals(BankingSystem.storedPin);
			                           }
		
	                    }
                


                          }