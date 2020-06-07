package com.mera.lection5.ex2;

public class SeasonStuff {

    enum Season{
        WINTER ("Winter", Game.SNOWBALLS),
        SPRING ("Spring", Game.BOATING),
        SUMMER ("Summer", Game.BERRY_PICKING),
        AUTUMN ("Autumn", Game.PUDDLE_MEASURING);

        private String name;
        private String game;

        Season(String seasonName, Game seasonGame){
            name=seasonName;
            game=seasonGame.toString();

        }

        public String getSeasonName(){
            return name;
        }

        @Override
        public String toString(){
            return String.format("The favorite season is %s with game '%s'", name, game);
        }
    }


    enum Game{
        SNOWBALLS ("Снежки"),
        BOATING ("Запуск корабликов по ручьям"),
        BERRY_PICKING ("Собирание и поедание ягод"),
        PUDDLE_MEASURING ("Измерение глубины луж методом \"сапога\"");

        private String game;

        Game(String game) {
            this.game = game;
        }
        public String toString(){
            return game;
        }
    }
}
