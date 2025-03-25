
public class ClassRoom{


	private String className;
	private String classCode;
	private Student students[];
	private Teacher teacher;
	private int stCount;

  public ClassRoom( String className,String classCode,Teacher teacher){
	this.className=className;
	this.classCode=classCode;
	this.teacher=teacher;
	this.students=new Student[5];
	this.stCount=0;
	}

	public String getClassName() {
        return className;
    	}

    	public String getClassCode() {
        return classCode;
    	}

    	public Teacher getTeacher() {
        return teacher;
    	}

	public boolean addStudent( Student student){
		if(stCount<5){

			students[stCount++]=student;
			return true;
			}
		else{
			System.out.println("The class"+className+" is already full. No more students can be added.");
			return false;
			}
	}

		@Override

	public String toString(){

			StringBuilder st= new StringBuilder("Class:"+className+"("+classCode+")\n");
			st.append("Teacher ").append(teacher.toString()).append("\nStudents:\n");
			for(int i=0;i<stCount;i++){
				st.append(students[i].toString()).append("\n");
					}
		return st.toString();

		}	

}