package org.example;


import java.util.Objects;

public class EmployeeSet {
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeSet that)) return false;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city);
    }

    private String city;

    public EmployeeSet(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



}
