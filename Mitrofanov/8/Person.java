class Person {
    @JsonName(jName = "firstName")
    public String firstName;

    @JsonName(jName = "lastName")
    public String lastName;

    @JsonName(jName = "years")
    public double age;

    @JsonIgnore
    String password;

    public Person() {
    }

    public Person(String firstName, String lastName, double age, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}

