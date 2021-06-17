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


       Book book1 = new Book("Le Java pour les nuls","toto",2020,500, "tous pour bien démarer avec Java", "nouvelle technologie", "Plon");
       Book book2 = new Book("20000 lieues sous les mers", "jules vernes", 1880,900 ,"lhistoire d'un capitaine fou ", "roman",
               "plon");

       Book book3 = new Book();
       book3.setTitle("livre 3");
       book3.setAuthor("lulu");
       book3.setNumberPage(10);
       book3.setCategory("bande déssinée");
       book3.setYearOfPublication(2020);

       //ajout des livres dans la collection
       books.add(book1);
       books.add(book2);
       books.add(book3);


       // on affiche avec une boucle

        for (Book l:books
             ) {
            l.showBook();
        }

/*
        faconj d'afficher unitairement

       book1.showBook();
       book2.showIfRoman();
       book1.showIfRoman();3

 */

    }
}
