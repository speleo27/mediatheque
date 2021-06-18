import java.time.LocalDate;
import java.util.ArrayList;

public class Mediatheque {
    /*
    livre
    adherent
    emprunt

     */
    public static void main(String[] args) {

        //creation de la collection
        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<Customer> customers = new ArrayList<Customer>();

       Book book1 = new Book("Le Java pour les nuls","toto",2020,"tous pour bien démarer avec Java",500,  "nouvelle technologie", "Plon");
       Book book2 = new Book("20000 lieues sous les mers", "jules vernes", 1880,"lhistoire d'un capitaine fou ",900 , "roman",
               "plon");
/*
       Book book3 = new Book();
       book3.setTitle("livre 3");
       book3.setAuthor("lulu");
       book3.setNumberPage(10);
       book3.setCategory("bande déssinée");
       book3.setYearOfPublication(2020);
*/
       //ajout des livres dans la collection
       books.add(book1);
       books.add(book2);
     //  books.add(book3);


       // on affiche avec une boucle

        for (Book l:books
             ) {
            l.showBook();
        }

/*
        facon d'afficher unitairement

       book1.showBook();
       book2.showIfRoman();
       book1.showIfRoman();3

 */
        customers.add(new Customer("Jean", "Valjean", 18, "3 chemin du pain", 0603011021));
        customers.add(new Customer("Pierre", "Paul", 25, "4 chemin du pain blanc", 0603551021));

        //on affiche l'adhérent'
        for (Customer c: customers){
            c.showCustomer();
        }
        ArrayList<Rental> rentals = new ArrayList<Rental>();
        rentals.add(new Rental(LocalDate.now(),customers.get(0),book2));
        rentals.add(new Rental(LocalDate.now(),customers.get(1),book1));

        for (Rental r:rentals) {r.showRental();}

        ArrayList<Document> documents= new ArrayList<Document>();
        documents.add(new VideoGame("arma3","bethesda", 2018,"le meilleur jeu de geurre jamais vu","+1000"));
        documents.add(new Dvd("Avatar","Cameron", 2018,"des hommes bleu","150"));

        for (Document doc: documents) {
                doc.showDoc();

        }

    }
}
