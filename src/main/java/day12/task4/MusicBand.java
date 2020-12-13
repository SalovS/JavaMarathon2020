package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
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

    public void addMember(String name) {
        members.add(name);
    }

    public void removeMember(String name) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).equals(name)) {
                members.remove(i);
                return;
            }
        }
    }

    public void delMembers() {
        members = new ArrayList<>();
    }

    public static void transferMembers(MusicBand band2, MusicBand band1) {
        for (String member : band2.getMembers()) {
            band1.addMember(member);
        }
        band2.delMembers();
    }

    public void printMembers() {
        for (String member : members) {
            System.out.println(member);
        }
    }

    public List<String> getMembers() {
        return members;
    }
}
