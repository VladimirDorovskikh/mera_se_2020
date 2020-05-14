package VostrikovaE.Lesson4.Exercise1;

public class Fruit {
    private int Weight;

    public Fruit(){}
    public Fruit(int Weight){
        this.Weight=Weight;
    }
    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "Weight=" + Weight +
                '}';
    }
}
