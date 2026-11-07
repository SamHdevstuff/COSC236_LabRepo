package library;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class LibraryApp {
	public static void main(String[] args) {
		Library library = new Library();
		LibrarianController lc = new LibrarianController(library);
	
		//LibraryApp library = new LibraryApp();
		System.out.println(" *** Library management system demo *** ");
	 
		
		// Adding some books to the catalog
		System.out.println("\n ======================================================================\n");
		System.out.println("Adding some books to the library:");
		System.out.println("\n *** Adding \"Dune\" to the library:");
		lc.addBook("Dune","Frank Herbert");
		
		System.out.println("\n *** Adding \"1984\" to the library:");
		lc.addBook("1984", "George Orwell"); 
		
		System.out.println("\n *** Adding \"Moby Dick\" to the library:");
	    lc.addBook("Moby Dick", "Herman Melville");
	    
	    System.out.println("\n *** Adding \"The Fellowship of the Ring\" to the library:");
	    lc.addBook("The Fellowship of the Ring", "J.R.R. Tolkien");
	
	    // Show available books
	    System.out.println("\n *** Show all books:");
	    lc.showAvailableBooks();
	    System.out.println("\n ======================================================================\n");
	    
	    // Remove a book and show available
	    System.out.println("\n ======================================================================\n");
	    System.out.println("Removing Books from the library: \n");
	    System.out.println("Removing Moby Dick from the library");
	    lc.removeBook("Moby Dick", "Herman Melville");
	    System.out.println();
	    lc.showAvailableBooks();
	    System.out.println("\n ======================================================================\n");
	    
	    //Add members to the library
	    System.out.println("\n ======================================================================\n");
	    System.out.println("Adding members to the library: ");
	    System.out.println("\n *** Adding \"Alice\" to the library members");
	    lc.addMember("LI235678", "Alice");
	    
	    System.out.println("\n *** Adding \"Bob\" to the library members");
	    lc.addMember("LI786456", "Bob");
	    
	    //show members
	    System.out.println();
	    System.out.println(" *** Show all members:");
	    lc.showMembers();
	    System.out.println("\n ======================================================================\n");
	    
	    //Borrow a book
	    System.out.println("\n ======================================================================\n");
	    System.out.println("Borrowing books: \n");
	    System.out.println("Alice borrows Dune: ");
	    lc.borrowBook("Dune", "LI235678");
	    
	    //show available books after borrowing
	    System.out.println(" *** Show all books:");
	    lc.showAvailableBooks();
	    System.out.println();
	    
	    System.out.println("Bob borrows 1984: ");
	    lc.borrowBook("1984", "LI786456"); 
	    
	    System.out.println(" *** Show all books:");
	    lc.showAvailableBooks();
	    System.out.println();
	    
	    System.out.println("Bob tries to borrow Dune:");
	    lc.borrowBook("Dune", "LI786456");
	    System.out.println("\n ======================================================================\n");
	    
	    //Return a book
	    System.out.println("\n ======================================================================\n");
	    System.out.println("Return a book\n");
	    System.out.println("Alice returns Dune");
	    lc.returnBook("Dune", "LI235678");
	    System.out.println(" *** Show all books:");
	    lc.showAvailableBooks();
	    System.out.println("\n ======================================================================\n");
	    
	    //display catalog
	    System.out.println("\n ======================================================================\n");
	    System.out.println("Display library catalog\n");
	    lc.displayCatalog();
	    System.out.println("\n ======================================================================\n");
    
    
    // Return a book
    /*
    System.out.println("\n *** Alice returns Dune:");
    library.returnBook("Dune", "Alice");
    */

    // Show available books after returning
    /*
    System.out.println("\n *** Show all books:");
    library.showAvailableBooks();

    System.out.println("\n *** Bob borrows Dune:") ;
    library.borrowBook("Dune", "Bob");
    */
    
    // Show available books after borrowing
    /*
    System.out.println("\n *** Show all books:");
    library.showAvailableBooks();
    */

	}
}