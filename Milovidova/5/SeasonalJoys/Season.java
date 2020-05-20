package com.company.SeasonalJoys;

import java.util.Random;

public enum Season {

        SPRING(Games.SHIPS),

        SUMMER(Games.BERRIES),

        AUTUMN(Games.PUDDLES),

        WINTER(Games.SNOWBALLS);

        final Games seasonalGame;


        Season(Games seasonalGame) {

        this.seasonalGame = seasonalGame;

        }

        public  static Season getRandomSeason() {
            Random random = new Random();
            int seasonNumber = random.nextInt(Season.values().length);
            Season season = null;
            if (seasonNumber == Season.SPRING.ordinal()) {
                season = Season.SPRING;
            } else if (seasonNumber == Season.SUMMER.ordinal()) {
                season = Season.SUMMER;
            } else if (seasonNumber == Season.AUTUMN.ordinal()) {
                season = Season.AUTUMN;
            } else if (seasonNumber == Season.WINTER.ordinal()) {
                season = Season.WINTER;
            }
            return season;
        }


}
