public class Library{

	private String name;
	private Book book;
	

    public Library(String name, Book book) {
        this.name = name;
        this.book = new Book(book);
        
    }
    
    public Library(Library other) {
        this(other.name, other.book);
    }

    public void showLibraryDetails() {
        System.out.println("Library: " + this.name);
        book.showBookDetails();
       
    }
   public boolean equals(Object obj) {

	}

   public String getName() { 
   	return name;
         }
    public void setName(String name) { 
	this.name = name; 
	}
}