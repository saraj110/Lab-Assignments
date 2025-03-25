
public class Teacher extends Person{

	private String subject;
	private String teacherId;

  public    Teacher( String name,int age,String subject, String teacherId){

	super(name,age);
	this.subject=subject;
	this.teacherId = teacherId;
	}


	
	public String getSubject() {
        return subject;
    	}
	 
	public String getTeacherId(){
        return teacherId;
	}

	@Override

	public boolean equals(Object obj){
		 if (this == obj) { 
        		return true;
  			  }
  	      if (obj == null || !(obj instanceof Teacher)) { 
        	return false;
   		 }
			Teacher other =(Teacher) obj;
		return this.teacherId.equals(other.teacherId);
	}
	

	@Override

        public String toString(){

		return super.toString()+ "\nSubject:"+subject;

	}
}