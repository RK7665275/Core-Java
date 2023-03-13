package com.oops;

import java.util.Scanner;

//
//
//class Library{
//	
//	 public String [] array2 =  {"2 states" , "Heaven" , "God Father" };
//	public String [] array1 =  {"2 states" , "Heaven" , "God Father" };
//	
//	void addBooks() {
//		System.out.println("THE ADDED BOOKS ARE");
//		
//		
//	}
//	void issueBooks() {
//		System.out.println("THE ISSUED BOOKS ARE:");
//		
//		
//	}
//	void returnBooks() {
//		
//	}
//	void showAvailableBooks() {
//		
//	}
//}
//public class Exercise4 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// You have to implement a library using Java Class "Library"
//        // Methods: addBook, issueBook, returnBook, showAvailableBooks
//        // Properties: Array to store the available books,
//        // Array to store the issued books
//        //
//		
//		Library l = new Library();
//		l.issueBooks();
//	System.out.println(array1);
//
//	}
//
//}



class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
    	System.out.println("Name Of The Book To Add : ");
    	Scanner sc= new Scanner(System.in);
    	book=sc.next();
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book){
            for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }

}
public class Exercise4 {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
    }
}

