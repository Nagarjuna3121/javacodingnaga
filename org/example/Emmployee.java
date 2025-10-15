package org.example;

import java.time.LocalDate;

public class Emmployee {
    private String name;
    private LocalDate dateOfJoining;

    public Emmployee(String name, LocalDate dateOfJoining) {
        this.name = name;
        this.dateOfJoining = dateOfJoining;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    @Override
    public String toString() {
        return name + " (" + dateOfJoining + ")";
    }
}
