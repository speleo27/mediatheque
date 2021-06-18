public class VideoGame extends Document {
    protected String duration;

    public VideoGame(String title, String author, int yearOfPublication, String description, String duration) {
        super(title, author, yearOfPublication, description);
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
