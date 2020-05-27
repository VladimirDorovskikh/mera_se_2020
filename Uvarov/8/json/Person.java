package mera.json;

public class Person {
    @Serializator.JsonName("name")
    private String firstName = "Vasya";

    @Serializator.JsonName("years")
    private double age = 12;

    @Serializator.JsonIgnore
    private String password;

    public Person() {
    }

    public Person(String firstName, double age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}