package com.mera.lection4.ex2;

import java.util.Random;
import com.mera.lection4.Fruit;

class Ex2 {
    public static void main(String[] args){
        Random r = new Random();
        AbstractFabric[] fabricList = new AbstractFabric[10];
        for (int i=0; i<10; i++){
            fabricList[i]=FabricFiller();
        }
        Fruit[] fabricOutput = new Fruit[20];
        for (int fabricOutItem=0, fabricListItem=0; fabricOutItem<fabricOutput.length; fabricListItem++){
            System.out.printf("%d. %s:\n", fabricListItem+1, fabricList[fabricListItem].getClass().getSimpleName());
            for (int step=0; step<2; step++, fabricOutItem++){
                fabricOutput[fabricOutItem]=fabricList[fabricListItem].makeFruit();
                System.out.printf("\t %s:\n", fabricOutput[fabricOutItem]);
            }
        }
    }

    private static AbstractFabric FabricFiller(){
        Random dice = new Random();
        return switch (dice.nextInt(4)) {
            case 0 -> new ThinOrangeFactory();
            case 1 -> new RedApplesFactory();
            case 2 -> new GreenApplesFactory();
            default -> new LongPinepplesFactory();
        };
    }

}
