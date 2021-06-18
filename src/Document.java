public abstract class Document {
    protected String title;
    protected String author;
    protected int yearOfPublication;
    protected  String description;

    public Document(){};

    public Document(String title, String author, int yearOfPublication, String description) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public void showDoc(){
        System.out.println(this.getTitle()+" ,"+this.getAuthor());
    }
}
