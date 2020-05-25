package com.mera.lection7.annotations;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@DatabaseTable(tableName = "my_person", firstId = 42)
public class MyPerson extends Object{

    @DatabaseField("first_name")
    public String firstName;

    @DatabaseField("last_name")
    public String lastName;

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }


    @SuppressWarnings("unchecked")
    public List<String> getListOfStrings() {
        List<Number> numbers = new ArrayList<>();
        numbers.add(42);
        return (ArrayList)numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPerson myPerson = (MyPerson) o;
        return Objects.equals(firstName, myPerson.firstName) &&
                Objects.equals(lastName, myPerson.lastName);
    }


}
