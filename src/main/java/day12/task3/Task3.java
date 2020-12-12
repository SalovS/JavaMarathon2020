package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<MusicBand>();
        musicBands.add(new MusicBand("ABBA", 1972));
        musicBands.add(new MusicBand("Boney M", 1975));
        musicBands.add(new MusicBand("Pink Floyd", 1965));
        musicBands.add(new MusicBand("Die Antwoord", 2008));
        musicBands.add(new MusicBand("Goose", 2000));
        musicBands.add(new MusicBand("Evans Blue", 2005));
        musicBands.add(new MusicBand("Inactive Messiah", 2001));
        musicBands.add(new MusicBand("Hello Saferide", 2005));
        musicBands.add(new MusicBand("Ace of Base", 1990));
        musicBands.add(new MusicBand("Course of Nature", 2001));
        for (MusicBand band : musicBands) {
            System.out.println(band.getName());
        }
        System.out.println();
        for (MusicBand band : groupsAfter2000(musicBands)) {
            System.out.println(band.getName());
        }
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<MusicBand>();
        for (MusicBand band : bands) {
            if (band.getYear() >= 2000)
                groupsAfter2000.add(band);
        }
        return groupsAfter2000;
    }
}
