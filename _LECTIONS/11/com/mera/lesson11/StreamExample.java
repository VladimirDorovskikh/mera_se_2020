package com.mera.lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {


    static int i = 0;


    static class PersonForStream {
        String name;
        boolean isMale;

        public PersonForStream(String name, boolean isMale) {
            this.name = name;
            this.isMale = isMale;
        }

        @Override
        public String toString() {

            return name;
        }
    }


    public static void main(String[] args) {
       /* int numberToSubtract = 1;


        Stream.generate(() -> i++)
                .map(i -> i * i)
                .map(element -> element - numberToSubtract)
                .forEach(System.out::println);

*/

        List<PersonForStream> persons = new ArrayList<>();
        persons.add(new PersonForStream("Вася", true));
        persons.add(new PersonForStream("Петя", true));
        persons.add(new PersonForStream("Мишп", true));
        persons.add(new PersonForStream("Алёна", false));
        persons.add(new PersonForStream("Вера", false));
        persons.add(new PersonForStream("Вероника", false));


       /* System.out.println(persons.stream().anyMatch(el -> el.name.equals("Андрей")));
        System.out.println(persons.stream().allMatch(el -> el.isMale));
        System.out.println(persons.stream().noneMatch(el -> el.name.equals("Андрей")));*/


        final Map<Character, List<PersonForStream>> mapPerson = persons
                .stream()
                .collect(Collectors.groupingBy(person -> person.name.charAt(0)));
      //  System.out.println(mapPerson);


        final Set<String> namesOnly = persons.stream().map(p -> p.name).collect(Collectors.toSet());
        System.out.println(namesOnly);


     /*   final Optional<PersonForStream> andrey = persons.stream().filter(el -> el.name.equals("Андрей")).findAny();


        final Integer reduce = Stream.of(1, 3, 5, 6, 7, 9)
                .map(i -> i * i)
                .reduce(0, (accumulated, anotherStreamElement) -> accumulated + anotherStreamElement);

        System.out.println(reduce);


        final Double avg = Stream.of(1, 3, 5, 6, 7, 9).collect(Collectors.averagingInt(i -> i));
        System.out.println(avg);



        final Optional<Integer> sum = Stream.of(1, 3, 5, 6, 7, 9).collect(Collectors.reducing((a, b) -> a + b));
        System.out.println(sum.get());
*/

        final Map<Boolean, List<Integer>> collect = Stream.of(1, 3, 5, 6, 7, 9).collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect);

    }
}
