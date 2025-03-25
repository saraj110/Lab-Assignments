
public class Student extends Person{

		private String rollNo;

    public  Student(String name,int age,String rollNo){

	super(name,age);
	this.rollNo=rollNo;
	}

	public String getRollNo() {
        return rollNo;
    	}

      @Override

	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if (obj==null || obj instanceof Student){
			return false;
		}
		Student other= (Student) obj;
	  return this.rollNo.equals(other.rollNo);
	

	}
      @Override

	public String toString(){

		return super.toString()+ "\nRoll No:"+rollNo;
	}

	
}