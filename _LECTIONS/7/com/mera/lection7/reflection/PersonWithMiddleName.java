package com.mera.lection7.reflection;

import java.util.Comparator;

public class PersonWithMiddleName extends Person implements Comparable<PersonWithMiddleName>{

    private static final Comparator<PersonWithMiddleName> COMPARATOR = Comparator
            .comparing(PersonWithMiddleName::getLastName)
            .thenComparing(PersonWithMiddleName::getFirstName)
            .thenComparing(PersonWithMiddleName::getMiddleName);

    private String middleName;

    public PersonWithMiddleName() {
    }

    public PersonWithMiddleName(String name, String firstName, String middleName) {
        super(name, firstName);
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public int compareTo(PersonWithMiddleName o) {
        return COMPARATOR.compare(this, o);
    }
}
