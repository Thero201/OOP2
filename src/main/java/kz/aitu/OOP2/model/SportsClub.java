package kz.aitu.OOP2.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SportsClub {

    private List<Person> members = new ArrayList<>();
    private List<Sport> sports = new ArrayList<>();

    // getters
    public List<Person> getMembers() {
        return members;
    }

    public List<Sport> getSports() {
        return sports;
    }

    // setters
    public void setMembers(List<Person> members) {
        this.members = members;
    }

    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public void addSport(Sport sport) {
        sports.add(sport);
    }

    // filtering
    public List<Player> getAdultPlayers() {
        return members.stream()
                .filter(p -> p instanceof Player)
                .map(p -> (Player) p)
                .filter(p -> p.getAge() >= 18)
                .collect(Collectors.toList());
    }

    // sorting
    public List<Person> sortMembersByName() {
        return members.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "SportsClub{" +
                "members=" + members +
                ", sports=" + sports +
                '}';
    }
}
