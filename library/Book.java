package library;
 
public class Book {

	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	// TODO: implement Book functionality 
	private String title;
	private String author;
	private boolean isAvailable; 
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	//manage own state of borrowed or available
	public void isBorrowed() {
		this.isAvailable = false;
	}
	
	public void isReturned() {
		this.isAvailable = true;
	}
	
	@Override
	public String toString() {
		return title + " by " + author + (isAvailable ? " [Available] " : " [Borrowed] ");
	}
}
