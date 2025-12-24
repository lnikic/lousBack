public class Song {
    private final String title;
    private final String artist;
    private final String genre;
    private final int year;
    private final int timesPlayed;

    public Song(String title, String artist, String genre, int year, int timesPlayed) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.timesPlayed = timesPlayed;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getTimesPlayed() {
        return timesPlayed;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return title + " " + artist + " " + genre;
    }

    //for the stream sort and distinct
    @Override
    public boolean equals(Object song) {
        Song other = (Song) song;
        if (title.equals(other.title) && artist.equals(other.artist)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}
