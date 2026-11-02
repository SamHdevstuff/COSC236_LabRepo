package library;

import java.util.ArrayList;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
	private memberId;
	private List<Book> borrowedBooks; 
	// TODO: implement collection of borrowed books
	public Member(String memberId, String name) {
		this.memberId = memberId;
		this.name = name;
		this.borrowedBooks = new ArrayLists<>();
	}
	public String getMemberId() {
		return memberId;
	}
	public String getName() {
		return name;
	}
	public List<Book> getBorrowedBooks(){
		return borrowedBooks;
	}
	// TODO: implement functionality of Member class
	 public void addMember(String memberName) {
	     if (!memberBorrowedBooks.containsKey(memberName)) {
	         memberBorrowedBooks.put(memberName, new ArrayList<>());
	         System.out.println("Member " + memberName + " has been added.");
	     } else {
	         System.out.println("Member " + memberName + " already exists.");
	     }
	 }
}
