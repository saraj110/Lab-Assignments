public class Address{

	private String street;
	private String city;
	
  public Address(String street,String city){

	this.street=street;
	this.city=city;
       }

  public Address(Address other){

	this.street=other.street;
	this.city=other.city;
     }
	 public void showAddress() {
        System.out.println("Street: " +this.street + ", City: " +this.city);

    }
	
      public boolean equals(Object obj) {
      
    }
	public String getStreet() { 
		return street;
 		}

    	public void setStreet(String street) { 	
		this.street = street;
		 }

    	public String getCity() { 
		return city; 
		}

   	public void setCity(String city) { 
		this.city = city;
	 }

}