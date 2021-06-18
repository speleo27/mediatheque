public class MusicCd extends VideoGame{
    private int numberTrack;

    public MusicCd(String title, String author, int yearOfPublication, String description, String duration, int numberTrack) {
        super(title, author, yearOfPublication, description, duration);
        this.numberTrack = numberTrack;
    }

    public int getNumberTrack() {
        return numberTrack;
    }

    public void setNumberTrack(int numberTrack) {
        this.numberTrack = numberTrack;
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


    public String getDuration() {
        return super.getDuration();
    }

    @Override
    public void setDuration(String duration) {
        super.setDuration(duration);
    }
}
