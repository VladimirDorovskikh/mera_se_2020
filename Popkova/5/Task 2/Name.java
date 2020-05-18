public enum Name {
    ANNA("Анна"),
    MIKE("Михаил"),
    MARIA("Мария"),
    SONYA("Соня");

    private String name;

    Name(String name) {
        this.name = name;
    }

    public String getValue() {
        return name;
    }
}
