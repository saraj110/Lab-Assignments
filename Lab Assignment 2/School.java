

public class School{

	private String name;
	private String address;
	private Principal principal;
	private ClassRoom[] classrooms;
	private int classCount;

	public School(String name, String address, Principal principal) {
        	this.name = name;
       	        this.address = address;
       	        this.principal = principal;
		this.classrooms = new ClassRoom[5];
		this.classCount=0;
}
	public String getName() {
        return name;
    	}

    	public String getAddress() {
        return address;
    	}

    	public Principal  getPrincipal() {
        return principal;
    	}
	public ClassRoom[] getClassrooms() {
    		return classrooms;
	}

	public void addClassRoom(ClassRoom classroom) {
   		 if (classCount < 10) {
     		   classrooms[classCount++] = classroom;
    } 
		else {
        System.out.println("Cannot add more classrooms.");
    }
}

	 @Override
    	public String toString() {
        	StringBuilder st = new StringBuilder("School: " + name + "\nAddress: " + address + "\n");
        	st.append("Principal ").append(principal.toString()).append("\n\nClassrooms:\n");
        	for (int i = 0; i < classCount; i++) {
          		  st.append(classrooms[i].toString()).append("\n");
      		  }
        return st.toString();
    }
}