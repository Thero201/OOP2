package kz.aitu.OOP2.model;

import java.util.Objects;

public class Sport {

    private int id;
    private String name;

    public Sport() {}

    public Sport(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sport)) return false;
        Sport sport = (Sport) o;
        return id == sport.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
