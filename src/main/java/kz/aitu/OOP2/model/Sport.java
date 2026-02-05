package kz.aitu.OOP2.model;

import java.util.Objects;

public class Sport {

    private final int id;
    private final String name;

    public Sport(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // logical equality by id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sport sport)) return false;
        return id == sport.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Sport{id=" + id + ", name='" + name + "'}";
    }
}
