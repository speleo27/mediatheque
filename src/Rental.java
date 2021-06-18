import java.time.LocalDate;

public class Rental {
   private LocalDate dateRental;
   private Customer customer;
   private Book book;

   public Rental(LocalDate dateRental, Customer customer, Book book) {
      this.dateRental = dateRental;
      this.customer = customer;
      this.book = book;
      customer.booksRental.add(book);
   }

   public Customer getCustomer() {
      return  customer;
   }

   public void setCustomer(Customer customer) {
      this.customer = customer;
   }

   public Book getBook() {
      return book;
   }

   public void setBook(Book book) {
      this.book = book;
   }

   public void showRental(){
      System.out.println("le livre : "+this.getBook()+" a été emprunté par: "+this.getCustomer());

   }


}
