public class Person{

	private String name;
	private String role;
	private String Address address;

    public Person(String name, String role, Address address) {
        this.name = name;
        this.role = role;
	this.address= new Address(address);
	}

    public Person(Person other) {
        this.name = other.name;
        this.role = other.role;
        this.address = new Address(other.address);
    }
   public void showPersonDetails(){
	System.out.println("Name:"+this.name+", Role:"+this.role);
	address.showAddress();
	}
   public boolean equals(Object obj){

	}
    public String getName() { 
	return name; 
	}
    public void setName(String name) { 
	this.name = name; 
	}
    public String getRole() { 
	return role; 
	}
    public void setRole(String role) { 
        this.role = role; 
	}
	
   
}