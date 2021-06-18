public class Book extends Document {

     private int numberPage;
     private String category; //sf , roman ,....
     private String editor;


    // constructeur



    public Book(String title, String author, int yearOfPublication, String description, int numberPage, String category, String editor) {
        super(title, author, yearOfPublication, description);
        this.numberPage = numberPage;
        this.category = category;
        this.editor = editor;
    }


    //méthodes





    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    @Override
    public int getYearOfPublication() {
        return super.getYearOfPublication();
    }

    @Override
    public void setYearOfPublication(int yearOfPublication) {
        super.setYearOfPublication(yearOfPublication);
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        if (numberPage>0) {this.numberPage = numberPage;}
    }



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void showBook(){
        System.out.println("titre : "+this.getTitle()+", auteur: "+this.getAuthor()+", Date de parution : "+ this.getYearOfPublication()+", description"+this.getDescription());
    }
    public void showIfRoman(){
       if (this.getCategory() == "roman"){
        System.out.println("c'est un roman");
       }else{
           System.out.println("ce n'est pas la bonne catégorie");
       }
    }
}
