public class Book {
    private String title;
     private String author;
     private int yearOfPublication;
     private int numberPage;
     private  String description;
     private String category; //sf , roman ,....
    private String editor;

    public Book(String title, String author, int yearOfPublication, int numberPage, String description, String category, String editor) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.numberPage = numberPage;
        this.description = description;
        this.category = category;
        this.editor = editor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void getBook(){
        System.out.println(this.getTitle()+" ,"+this.getAuthor()+" ,"+ this.getYearOfPublication()+" ,"+this.getDescription());
    }
}
