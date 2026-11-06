package library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of Member class
	private Library library;
	
	public LibrarianController(Library library) {
		this.library = library;
	}
	
	//controller: add books and members
	public void addBook(String title, String author) {
		library.addBook(title, author);
		System.out.println("Book added to library: " + title + " by " + author);
	}
	public void removeBook(String title, String author) {
		library.removeBook(title, author);
		System.out.println("Book removed from library: " + title + " by " + author);
	}
	
	public void addMember(String memberId, String name) {
		library.addMember(memberId, name);
		System.out.println("Member added to library:" + "\nName: " + name + "\nID: " + memberId);
	}
	public void removeMember(String memberId, String name) {
		library.removeMember(memberId, name);
		System.out.println("Member removed from library: " + "\nName: " + name + "\nID: " + memberId);
	}
	
	//controller: borrow and return books
	public void borrowBook(String title, String memberId) {
		Book book = library.findBook(title);
		Member member = library.findMember(memberId);
		
		if (book == null) {
			System.out.println("Book not found: " + title);
			return;
		}
		if (member == null) {
			System.out.println("Member not found: " + memberId);
			return;
		}
		if (!book.isAvailable()) {
			System.out.println(title + " is currently unavailable.");
			return;
		}
		
		member.borrowBook(book);
		System.out.println(member.getName() + " has borrowed " + title);
	}
	public void returnBook(String title, String memberId) {
		Book book = library.findBook(title);
		Member member = library.findMember(memberId);
		
		if (book == null) {
			System.out.println("Book not found: " + title);
			return;
		}
		if (member == null) {
			System.out.println("Member not found: " + memberId);
			return;
		}
		if (!member.hasBorrowed(book)) {
			System.out.println(member.getName() + " has not borrowed " + title);
			return;
		}
		
		member.returnBook(book);
		System.out.println(member.getName() + " has returned " + title);
	}
	
	//controller: show available books and members
	public void showAvailableBooks() {
		System.out.println("Available Books: ");
		for (Book book: library.getAvailableBooks()) {
			System.out.println(book);
		}
	}
	public void showMembers() {
		System.out.println("Members: ");
		for (Member member: library.getMembers()) {
			System.out.println(member);
		}
	}
}
