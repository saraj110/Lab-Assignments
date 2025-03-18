public class Demo1{

	public static void main(String args[]){
	Employee e1= new Employee("Ruhma","HOD");
	Employee e2= new Employee("Sara","Incharge");
	SystemUnit s1= new SystemUnit("Intel i5",16,265,"Mac M4","C0101");
	SystemUnit s2= new SystemUnit("Intel i6",16,265,"Mac M4","C0105");
	SystemUnit s3= new SystemUnit("Intel i7",16,265,"Mac M4","C0107");
	
	
	SystemUnit[] s = { s1, s2, s3 };
	
	Lab obj1=new Lab("OOP",e1,s,true);
	System.out.println(obj1.toString());
	  
	}

}