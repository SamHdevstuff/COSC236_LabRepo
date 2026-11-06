package library;
import java.util.ArrayList;
import java.util.List;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	
	// private borrowedbBooks TODO: implement collection of borrowed books
	
	// TODO: implement functionality of Member class
	private String name;
	private String  memberId;
	private List<Book> borrowedBooks;
	
	public Member(String memberId, String name) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBooks = new ArrayList<>();
	}
	
	public String getMemberId() {
		return memberId;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}
	
	public boolean hasBorrowed(Book book) {
		return borrowedBooks.contains(book);
	}
	
	public void borrowBook(Book book) {
		borrowedBooks.add(book);
		book.isBorrowed();
	}
	
	public void returnBook(Book book) {
		borrowedBooks.remove(book);
		book.isReturned();
	}
	
	@Override
	public String toString() {
        return "Name: " + name + ",  ID: " + memberId;
    }

}
