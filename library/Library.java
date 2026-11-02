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

	// TODO: implement functionality of Member class

}
