import java.util.Random;


public class Task2{
      
    public static void main(String[] args) {

        int maxName = 5;
        int numSeasons = 4;
         
        String[] firstNames  = new String[] {"Роман", "Тимофей", "Владимир", "Афанасий", "Алексей"};

        Season[] seasons  = new Season[] {Season.Зима, Season.Весна, Season.Лето, Season.Осень};
        
        int numOfPersons = 10;
        int name=0, season=0;
        
        Random rnd = new Random(System.currentTimeMillis());
        
        Person[] persons  = new Person[numOfPersons]; 
        
        for(int i=0;i<numOfPersons;i++) {
        name = rnd.nextInt(maxName);
        season = rnd.nextInt(numSeasons);
        persons[i] = new Person(firstNames[name], seasons[season]);
          System.out.printf("Человек №%d - %s (%s)\n", i, persons[i], persons[i].favoriteSeason.getSeason());
        }
        
    }
}


enum Games {
  
    snow("снежки"), 
    boats("запуск корабликов по ручьям"), 
    berries("собирание и поедание ягод"), 
    plash("измерение глубины луж методом \"сапога\"");
        
    private String game;
        
        
    Games(String game){
        this.game = game;
    }
    
    public String getGame(){ return game;}
}

enum Season {
  
    Зима(Games.snow.getGame()),
    Весна(Games.boats.getGame()),
    Лето(Games.berries.getGame()),
    Осень(Games.plash.getGame());
    
    private String season;
        
        
    Season(String season){
        this.season = season;
    }
    
    public String getSeason(){ return season;}
    
}

class Person{
     
    String name;    // имя
    Season favoriteSeason;    // любимый сезон

    Person(String name, Season favoriteSeason) {
        this.name = name;
        this.favoriteSeason = favoriteSeason;
    }

    
    public String getFavoriteSeason() {
       return favoriteSeason.getSeason();
    }
   
    public String getName () {
       return name;
    }
   
    public String toString() {
        return (name + ", любимое время года - " + favoriteSeason);
        
   }
   
}
