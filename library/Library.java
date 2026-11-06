package library;
import java.util.ArrayList;
import java.util.List;

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
	
	
	
	// GRASP creator: create and store books
	public Book addBook(String title, String author) {
		Book book = new Book(title, author);
		catalog.add(book);
		return book;
	}
	public void removeBook(String title, String author) {
		Book book = findBook(title);
		catalog.remove(book);
	}
	
	// GRASP creator: create and store members
	public Member addMember(String memberId, String name) {
		Member member = new Member(memberId, name);
		members.add(member);
		return member;
	}
	public void removeMember(String memberId, String name) {
		Member member = findMember(memberId);
		members.remove(member);
	}
	
	public Book findBook(String title) {
		for (Book book: catalog) {
			if (book.getTitle().equals(title)) {
				return book;
			}
		}
		return null;
	}
	
	public Member findMember(String memberId) {
		for (Member member: members) {
			if (member.getMemberId().equals(memberId)) {
				return member;
			}
		}
		return null;
	}
	
	public List<Book> getAvailableBooks() {
		List<Book> available = new ArrayList<>();
		for (Book book: catalog) {
			if (book.isAvailable()) {
				available.add(book);
			}
		}
		return available;
	}
	
	public List<Member> getMembers() {
		return members;
	}
	
	public List<Book> getCatalog() {
		return catalog;
	}
	


}
