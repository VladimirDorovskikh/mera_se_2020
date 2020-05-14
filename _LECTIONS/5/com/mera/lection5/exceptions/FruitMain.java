package com.mera.lection5.exceptions;

public class FruitMain {

    public static void main(String[] args) {


        System.out.println(makeApple());

    }


    public static String makeApple() {
        ConnectionForApple connection = new ConnectionForApple();
        try {
            Apple a = new Apple(connection.getAppleColor(), connection.getWeight());
            return "Яблоко готово!";
        } catch (FruitException e) {
            throw new IllegalArgumentException("Ошибка");
           // return "Ошибка";
        }
        finally {
            connection.close();
            return "По умолчанию";
        }
    }

}
