package com.mera.lection4;

import java.util.Random;

public  class Apple extends Fruit {

        public static final int NUMBER_OF_COLORS = 3;
        public String color;
        Random r = new Random();

        /**
         * Generate Apple
         *
         * @param colorNum define Apple color
         *                 0 - red
         *                 1 - yellow
         *                 2 - green
         */
        public Apple(int colorNum) {
            color = defineColor(colorNum);
        }

        public Apple() {
            color = defineColor(r.nextInt(NUMBER_OF_COLORS));
        }

        /**
         * @param colorNum should not be more than the NUMBER_OF_COLORS variable
         *                 Change the NUMBER_OF_COLORS variable after new cases adding
         * @return
         */
        private String defineColor(int colorNum) {
            String definedColor;
            switch (colorNum) {
                case 0:
                    definedColor = "red";
                    break;
                case 1:
                    definedColor = "yellow";
                    break;
                case 2:
                    definedColor = "green";
                    break;
                default:
                    definedColor = defineColor(r.nextInt(NUMBER_OF_COLORS));
            }
            return definedColor;
        }


        @Override
        public String toString() {
            return String.format("This is the %s %s with weight %d", color, getClass().getSimpleName(), weight);
        }
    }
