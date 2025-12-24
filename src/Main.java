import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Song> songs = new Songs().getSongs();
        List<Song> rockSongs = songs.stream()
                .filter(s -> s.getGenre().contains("Rock"))
                .collect(Collectors.toList());
        System.out.println(rockSongs);

        var filteredSongs = songs.stream()
                .filter(s -> s.getArtist().contains("The Beatles") || s.getTitle().startsWith("H") || s.getYear() > 1995)
                .toList();
        System.out.println(filteredSongs);

        List<String> genre = songs.stream()
                .map(Song::getGenre)
                .distinct()
                .toList();
        System.out.println(genre);

        String songTittle = "With a Little Help from My Friends";
        List<String> result = songs.stream()
                .filter(s -> s.getTitle().equals(songTittle))
                .map(Song::getArtist)
                .filter(a -> !a.equals("The Beatles"))
                .toList();
        System.out.println(result);
    }
}