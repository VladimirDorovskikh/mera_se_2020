package com.pradedov.lab8.serialization;

public class Person {
    @JsonName(key = "name")
    private final String personName;

    @JsonName(key = "surname")
    private final String personSurname;

    @JsonIgnore()
    private final String secret;

    @JsonName(key = "address")
    private final String personAddress;

    @JsonName(key = "age")
    private final double personAge;

    public Person() {
        this.personName = null;
        this.personSurname = null;
        this.personAge = 0;
        this.secret = null;
        this.personAddress = null;
    }

    public Person(String personName, String personSurname, double personAge, String secret, String personAddress) {
        this.personName = personName;
        this.personSurname = personSurname;
        this.personAge = personAge;
        this.secret = secret;
        this.personAddress = personAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personSurname='" + personSurname + '\'' +
                ", personAge=" + personAge +
                ", secret='" + secret + '\'' +
                ", personAddress='" + personAddress + '\'' +
                '}';
    }
}
