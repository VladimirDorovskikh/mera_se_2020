package com.mera.lesson11;

import java.util.Set;

public class MethodReferrenceStaticExample {

    /*class Person {
        Set<String> professions;
        public void addProfessions(String profession, Integer mark) {
            professions.add(profession);
        }
    }

    public interface PersonFiller {
         void readPerson(Person person, String profession, Integer mark);
    }
*/
    public interface NumberOperation {
        int invoke(int one, int another);
    }

    public static void main(String[] args) {
        // static method referrence

        NumberOperation plusAnonymous = new NumberOperation() {
            @Override
            public int invoke(int one, int another) {
                return summ(one, another);
            }
        };

        NumberOperation plusLambda = (one, two) -> summ(one, two);

        NumberOperation plus = MethodReferrenceStaticExample::summ;
        NumberOperation minus = MethodReferrenceStaticExample::diff;

        System.out.println(plus.invoke(2, 4));
        System.out.println(minus.invoke(5, 3));
    }


    static int summ(int op1, int op2) {
        return op1 + op2;
    }
    static int diff(int op1, int op2) {
        return op1 - op2;
    }

}
