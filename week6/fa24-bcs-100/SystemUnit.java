public class SystemUnit{


	private String cpuName;
	private int ramSize;
	private int diskSize;
	private String systemId;
	private String lcdModel;

   public SystemUnit( String cpuName,int ramSize,int diskSize,String lcdModel){

	this.cpuName=cpuName;
	this.ramSize=ramSize;
	this.diskSize=diskSize;
	this.lcdModel=lcdModel;


	}
	
	public String getCpuName(){

	 	return cpuName;
	}
	public void setCpuName(String cpuName){

		this.cpuName=cpuName;
	}
	public int getDiskSize(){

	 	return diskSize;
	}
	public void setCpuName(int diskSize){

		this.diskSize=diskSize;
	}
	public int getRamSize(){

	 	return ramSize;
	}
	public void setRamSize(int ramSize){

		this.ramSize=ramSize;
	}
	public String getLcdModel(){

	 	return lcdModel;
	}
	public void setLcdModel(String lcdModel){

		this.lcdModel=lcdModel;
	}
	
	public String toString(){
		return String.format("PC details:\n Cpu Name:%s\n Lcd Model:%s\n Ram Size:%d\n Disk Size:%d\n System Id:%s\n",cpuName,lcdModel,ramSize,diskSize,systemId);
	}



}