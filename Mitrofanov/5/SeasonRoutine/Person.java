package SeasonRoutine;

import java.util.Arrays;
import java.util.Random;

public class Person {

    String firstName;
    Season favoriteSeason;

    public Person(String firstName, Season favoriteSeason) {
        this.firstName = firstName;
        this.favoriteSeason = favoriteSeason;
    }

    public String getFirstName() {
        return firstName;
    }

    public Season getFavoriteSeason() {
        return favoriteSeason;
    }

    @Override
    public String toString() {
        return firstName;
    }
}
