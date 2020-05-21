import java.util.Objects;

public class Bicycle{
    final private String modelName;
    private int maxSpeed; 

    public Bicycle(String modelName, int maxSpeed) {
        this.modelName = modelName;
        try {
            if (5 <= maxSpeed & maxSpeed <= 50) {       // (от 5 до 50км\ч);
                this.maxSpeed = maxSpeed;
            } else {
                throw new BicycleSpeedException("");
                }
            }catch (BicycleSpeedException e) {
            System.out.println("The following Element has not added because max speed should be from 5 to 50:  " + modelName + " with max speed "+maxSpeed);
        }
    }

    public String getModelName(){
        return modelName;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }

    public String toString() {
        return "Bicycle: " + "modelName '" + modelName + "',  max speed " + maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Bicycle)) {
            return false;
        }
        Bicycle bicycle = (Bicycle) o;
        return bicycle.modelName.equals(modelName) &
                bicycle.maxSpeed == maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName,maxSpeed);
    }

}
