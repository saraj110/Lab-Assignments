public class Book{

	private String Title;
	private String issn;
	private Date publicationDate;
	private Person author;



	public Book(String Title, String issn, Date publicationDate, Person author) {
         	this.title = title;
        	this.issn = issn;
        	this.publicationDate = new Date(publicationDate);
        	this.author = new Person(author);
    }
	 
   	 public Book(Book other) {
           this(other.title, other.issn, other.publicationDate, other.author);
    }
    
	void showBookDetails(){
	 	System.out.println("Title:"+title+",ISSN:"+issn);
		System.out.print("Publication Date: ");
           	publicationDate.showDate();
       	        System.out.println("Author: " + author.getName());
		
	}

	boolean equals(Object obj){
	

	}
	
	 public String getTitle(){
		return title;
		}

	public void setTitle( String title){
		this.title=title;
	}
	
	public string getIssn(){
		return issn;
	}

	public void setIssn(String issn){
		this.issn=issn;
	}


}