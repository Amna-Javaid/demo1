package com.example.demo1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VaccinationManagement {
    List<Person> persons;

    VaccinationManagement(){
        persons = new ArrayList<>();
        persons.add(new Person("John Doe", "12345", "IT", true));
        persons.add(new Person("Jane Doe", "67890", "HR", false));
    }

    public void addPerson(Person person) {
        persons.add(person);

    }

    public boolean checkVaccinationStatus(String cnic) {
        for (Person person : persons) {
            if (person.CNIC.equals(cnic)) {
                if(person.isVaccinated) {
                    return true;
                }
            }
        }
        return false; // Person not found
    }
}
