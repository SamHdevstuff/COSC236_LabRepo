package library;

public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	// Attributes:
	private List<Book> catalog; 
	private List<Member> members;
	
	public Library() {
		this.catalog = new ArrayList<>();
		this.members = new ArrayList<>();
	}
	 public void addBook(String bookName) {
	     availableBooks.add(bookName);
	     System.out.println(bookName + " has been added to the catalog.");
	 }
	// TODO: implement functionality of Member class

}
