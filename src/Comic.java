public class Comic extends Book{

    public Comic(String title, String author, int yearOfPublication, String description, int numberPage, String category, String editor) {
        super(title, author, yearOfPublication, description, numberPage, category, editor);
    }

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
}
