package Lecture_5;

import java.util.Random;

public class Person {

    String name;
    String favoriteSeason;
    
    public Person(String name, String favoriteSeason) {
		this.name = name;
		this.favoriteSeason = favoriteSeason;
	}

    
    public String toString() {
    	if (favoriteSeason == "Spring") {
    		favoriteSeason = Seasons.SPRING.toString();
    	}
    	else if(favoriteSeason == "Summer") {
    		favoriteSeason = Seasons.SUMMER.toString();
    	}
    	else if(favoriteSeason == "Autumn") {
    		favoriteSeason = Seasons.AUTUMN.toString();
    	}
    	else {
    		favoriteSeason = Seasons.WINTER.toString();
    	}
    	return this.name + " like "+ favoriteSeason;
     }
    
    
    enum Seasons {
    	SPRING{public String toString() {return Games.LAUNCH_BOATS_ON_STREAMS.toString();}},
    	SUMMER{public String toString() {return Games.PICKING_AND_EATING_BERRIES.toString();}},
        AUTUMN{public String toString() {return Games.MEASURING_PUDDLES_DEPTH_USING_BOOT_METHOD.toString();}},
        WINTER{public String toString() {return Games.SNOWBALLS.toString();}}
        }

    enum Games {
    	SNOWBALLS{public String toString() {return "playing snowballs";}},
        LAUNCH_BOATS_ON_STREAMS{public String toString() {return "launch boat on stream";}},
        PICKING_AND_EATING_BERRIES{public String toString() {return "picking and eating berries";}},
        MEASURING_PUDDLES_DEPTH_USING_BOOT_METHOD{public String toString() {return "measuring puddles depth using boot method";}}
        }



	public static void main(String[] args) {
        String[] namesList = {"Vasya", "Petya", "Olya", "Sasha", "Kolya"};
        String[] seasonList = {"Winter", "Spring", "Summer", "Autumn"};
        Person[] personList = new Person[10];
        for (int n=0; n<10; n++){
            personList[n] = new Person(namesList[new Random().nextInt(5)], seasonList[new Random().nextInt(4)]);
            System.out.println(personList[n]);
        }

	}

}
