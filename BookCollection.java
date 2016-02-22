/*
 * WWU: CS145 Winter 2016, Lab5
 *
 * BookCollection.java
 *
 * Modified by David Palzer
 *
 * Maintain a collection of books.
 *
 * Dependencies:
 *    Book.java, provided
 */

public class BookCollection{

   public class BookNotFound extends IllegalArgumentException {
      public BookNotFound(String msg) {
         super(msg);
      }
   }

   public class DuplicateBook extends IllegalArgumentException {
      public DuplicateBook(String msg) {
         super(msg);
      }
   }

   public class CollectionFull extends IllegalStateException {
      public CollectionFull(String msg) {
         super(msg);
      }
   }

   // Limit on size of collection.
   public static final int LIMIT = 200;
   private Book[] bookArray;
   private int size;
   private int currentSize;

   public BookCollection(int size){
        this.size = size;
        this.bookArray = new Book[size];
        this.currentSize = 0;
   }

   public void addBook(Book book){
    findBook (book.isbn);
    this.bookArray[currentSize] = book;
    currentSize++;
   }
   // TODO: Other data fields as needed.



    //public static BookCollection merge(Book Collection collection1, BookCollection collection2){
      //return;//whatever a BookCollection is
    }

    private Book findBook(String isbn){
      for (book : this.bookArray){
        if (this.bookArray[i].getisbn.equals isbn){
          throw DuplicateBookException;
        }
      }
      return null;
    }



    public double getStockValue (){
      for//all the books in the collection
      //hold up why are we not passing this thing a book tho
        Book book = this.bookArray[i];
        return book.getStockValue;
    }

    public Book objectAt(int i){
      if (i>currentSize || i<0)
        throw IndexOutOfBoundsException;
      else
        return bookArray[i];
    }

    public void changeStock(String isbn, int quantity){
      Book theBook = findBook(isbn);
      if (theBook == null){
        throw new BookNotFound(isbn);
      }
      theBook.changeStock(quantity);
    }


    public int getSize(){
      return currentSize;
    }


    // Sample method: changePrice
    /* Change the price of a book.
     *
     * Change the price of the book specified by the given ISBN to
     * the given price. If the isbn cannot be found in the collection
     * a BookNotFound exception is thrown.
     */
   public void changePrice(String isbn, double price) {
      Book theBook = findBook(isbn);
      if (theBook == null) {
         throw new BookNotFound(isbn);
      }
      theBook.setPrice(price);
   }

	// TODO: Provide constructor and other methods.
}
