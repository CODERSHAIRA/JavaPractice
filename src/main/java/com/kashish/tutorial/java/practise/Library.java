// You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
package com.kashish.tutorial.java.practise;

   class Library {
 public String issueBook;
 public String returnBook;
 public String availableBook;
  public void addBook() {
		
	}
  public String getissueBook() {
		return issueBook;
	}
  public void setissueBook(String a) {
		this.issueBook=a;
	}
  public String getreturnBook(String b) {
        return returnBook;
  }
  public void setreturnBook(String b) {
	  this.returnBook=b;
	}
  public String getshowAvailableBooks(String c) {
        return availableBook;
  }
	
  public void setshowAvailableBooks(String c) {
	  this.availableBook=c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Library l=new Library();
      l.setissueBook("harry potter");
      System.out.print( l.getissueBook());
     
	}

}
