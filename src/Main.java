import java.util.List;
import java.util.Optional;
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

        boolean result1 = songs.stream()
                .anyMatch(s -> s.getGenre().equals("R&B"));
        System.out.println(result1);

        Optional<Song> result2 = songs.stream()
                .filter(song -> song.getYear() == 1995)
//                .skip(1)
                .findFirst();
        System.out.println(result2);

        String songTittle = "With a Little Help from My Friends";
        List<String> result = songs.stream()
                .filter(s -> s.getTitle().equals(songTittle))
                .map(Song::getArtist)
                .filter(a -> !a.equals("The Beatles"))
                .toList();
        System.out.println(result);
    }
}