

public class Main{

	public static void main(String[] args) {

		Principal principal=new Principal("Lamine",44,15);
		School school=new School("BSS","Valencia",principal);
		
		Teacher t1=new Teacher("Lewandoski",34,"OOP","O105");
		Teacher t2=new Teacher("Pedri",24,"PF","O106");

		ClassRoom c1=new ClassRoom("Class 10","C10",t1);
		ClassRoom c2=new ClassRoom("Class 9","C09",t2);

		school.addClassRoom(c1);
		school.addClassRoom(c2);
	
		Student s1=new Student("Gavi",15,"FA45");
		Student s2=new Student("Messi",20,"FA35");
		Student s3=new Student("Yamal",18,"FA65");
		Student s4=new Student("Rodri",19,"FA98");

		c1.addStudent(s1);
		c1.addStudent(s2);
		c1.addStudent(s3);
		c1.addStudent(s4);

	 System.out.println(school.toString());

        System.out.println("Comparing Students: " + s1.equals(s2));
        System.out.println("Comparing Teachers: " + t1.equals(t2));

	}


}