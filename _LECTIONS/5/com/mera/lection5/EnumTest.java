package com.mera.lection5;

public class EnumTest {





    public int getAverageTemperature(String season) {
        switch (season) {
            case "весна":
                return 0;
            case "лето":
                return 10;
            case "осень":
                return 0;
            case "зима":
                return -10;
            default:
                throw new IllegalArgumentException("Нет такого сезона");
        }
    }





    public static int getAverageTemperatureEnum(Season season) {
        switch (season) {
            case SPRING: return 0;
            case SUMMER: return 10;
            case AUTUMN: return 0;
            case WINTER: return -10;
        }

        throw new IllegalArgumentException("Нет такого сезона");
    }

    public static int getAverageTemperatureEnumMethod(Season season) {
        return season.getAverageTemperature();
    }

    public static void main(String[] args) {
        System.out.println(getAverageTemperatureEnumMethod(Season.WINTER));
    }


}

enum Season {
    SPRING(0),
    SUMMER(10),
    AUTUMN(0),
    WINTER(-10);

    final int averageTemperature;


    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }
}

