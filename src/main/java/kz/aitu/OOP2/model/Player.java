package kz.aitu.OOP2.model;

import java.util.Objects;

public class Player extends Person {

    private final int age;

    public Player(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    // getter
    public int getAge() {
        return age;
    }

    // equals based on id (logical equality)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Player{id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age + '}';
    }
}
