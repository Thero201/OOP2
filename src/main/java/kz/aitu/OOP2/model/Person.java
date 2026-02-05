package kz.aitu.OOP2.model;

public abstract class Person {

    protected int id;
    protected String name;

    public Person() {}

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // abstract behavior
    public abstract String getRole();

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "'}";
    }
}