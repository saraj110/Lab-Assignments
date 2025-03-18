public class Lab{


	private String labName;
	private Employee labStaff;
	private SystemUnit[] system=new SystemUnit[50];
	private boolean hasMultimedia;

    public Lab( String labName, Employee labStaff, SystemUnit[] system, boolean hasMultimedia){

		this.labName=labName;
		this.hasMultimedia=hasMultimedia;
		this.labStaff=labStaff;
		this.system=system;	
		


	}
	
        public String getLabName(){

	 	return labName;
	}
	public void setLabName( String labName){

		this.labName=labName;
	}
	public boolean getHasMultimedia(){

	 	return hasMultimedia;
	}
	public void setHasMultimedia( boolean hasMultimedia){

		this.hasMultimedia=hasMultimedia;
	}

	public Employee getLabStaff(){
		return  labStaff;
	}

	public SystemUnit[] getSystem(){
		return system;
	}
	public void setSystem( SystemUnit[] system){

		this.system=system;
	}
	public void set( Employee labStaff){
		this.labStaff=labStaff;
	}

	public String toString(){
		StringBuilder st= new StringBuilder();
		st.append(labName);
		st.append(labStaff);
		for(int i=0; i<system.length;i++){
			st.append(system[i]);
		}
		st.append(hasMultimedia);
		return st.toString();
	}
	

}