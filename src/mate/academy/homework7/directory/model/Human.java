package mate.academy.homework7.directory.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Human implements Serializable {
    private String name;
    private String surName;
    private Sex typeOfSex;
    private LocalDate dateOfBirth;

    public Human(String name, String surName, Sex typeOfSex, LocalDate dateOfBirth) {
        this.name = name;
        this.surName = surName;
        this.typeOfSex = typeOfSex;
        this.dateOfBirth = dateOfBirth;
    }

   public enum Sex{
        MALE,
        FAMALE
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", typeOfSex=" + typeOfSex +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
