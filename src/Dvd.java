public class Dvd extends VideoGame {
    public Dvd(String title, String author, int yearOfPublication, String description, String duration) {
        super(title, author, yearOfPublication, description, duration);
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
