package com.mera.lection4;

import java.util.Random;

public class Pineapple extends Fruit {
        int greenTop;
        public static final int MIN_GREENTOP = 5;
        public static final int MAX_GREENTOP = 20;

        public Pineapple(){
            greenTop=greenTopGenerator(MIN_GREENTOP, MAX_GREENTOP);
        }

        public Pineapple(int min, int max){
            greenTop=greenTopGenerator(min, max);
        }

        @Override
        public String toString(){
            return String.format("This is the %s with green top lenght %s and weight %d", getClass().getSimpleName(), greenTop, weight );
        }

        private int greenTopGenerator(int minGreenTop, int maxGreentop){
            Random r = new Random();

            if (minGreenTop>maxGreentop){
                int buf = maxGreentop;
                maxGreentop = minGreenTop;
                minGreenTop = buf;
            }
            if (minGreenTop<MIN_GREENTOP){
                minGreenTop=MIN_GREENTOP;
            }
            if (maxGreentop>MAX_GREENTOP){
                maxGreentop=MAX_GREENTOP;
            }

            int bound = maxGreentop-minGreenTop+1;

            return (r.nextInt(bound)+minGreenTop);
        }
    }
