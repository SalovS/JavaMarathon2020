package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void addMember(MusicArtist name) {
        members.add(name);
    }

    public void removeMember(String name) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equals(name)) {
                members.remove(i);
                return;
            }
        }
    }

    public void delMembers() {
        members = new ArrayList<>();
    }

    public static void transferMembers(MusicBand band2, MusicBand band1) {
        for (MusicArtist member : band2.getMembers()) {
            band1.addMember(member);
        }
        band2.delMembers();
    }

    public void printMembers() {
        for (MusicArtist member : members) {
            System.out.println(member.getName());
        }
    }

    public List<MusicArtist> getMembers() {
        return members;
    }
}
