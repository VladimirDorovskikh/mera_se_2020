package mera.json;

public class Chupakabra {

    @Serializator.JsonName("name")
    private String name = "Chupakabra";

    @Serializator.JsonName("years")
    private int age = 2000;

    @Serializator.JsonName("tail")
    private double tailLength = 66.7;

    @Serializator.JsonName("meal")
    private String favoriteMeal = "Chicken";

    @Serializator.JsonIgnore
    private String areal;

    public Chupakabra() {
    }

    public Chupakabra(String name, int age, double tailLength, String favoriteMeal, String areal) {
        this.name = name;
        this.age = age;
        this.tailLength = tailLength;
        this.favoriteMeal = favoriteMeal;
        this.areal = areal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public String getFavoriteMeal() {
        return favoriteMeal;
    }

    public void setFavoriteMeal(String favoriteMeal) {
        this.favoriteMeal = favoriteMeal;
    }

    public String getAreal() {
        return areal;
    }

    public void setAreal(String areal) {
        this.areal = areal;
    }

    @Override
    public String toString() {
        return "Chupakabra{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tailLength=" + tailLength +
                ", favoriteMeal='" + favoriteMeal + '\'' +
                ", areal='" + areal + '\'' +
                '}';
    }
}
