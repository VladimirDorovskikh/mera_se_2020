import com.mera.training.dorovskikh.lambda.*;

/**
 * Лямбда-выражения
 * Задание 1.
 * создайте класс Person  с полями
 *  имя:String,
 *  возраст:int
 *
 *  Создайте коллекцию людей
 *  Отсортируйте коллекцию сначала по имени, выведите на экран
 *   Затем - по возрасту, выведите на экран.
 *
 * Для сортировки используйте Collecitons.sort(collection, comparator)
 * компаратор задайте в виде лямбда выражения
 *
 * Задание 2.Расширяемый калькулятор
 * Создать класс Calculator, который может выполнять операции на двумя числами.
 * определить метод calculate(String operationName, Double number1, Double number2);
 *
 * Операции могут быть разными и хранятся внутри калькулятора.
 *
 * Определите интерфейс
 * interface Operation {
 *        Double doOperation(Double number1, Double number2) throw ArithmeticException;
 *  }
 *
 *  в классе калькулятор создайте метод, который добавляет новую операцию в калькулятор:
 *  void addOperation(String operationName, Operation implementation);
 *
 *  Добавьте в калькулятор операции:
 *  Умножение
 *  Деление
 *  Сложение
 *  Вычитание
 *  Возведение в степень
 *  Извлечение корня степени n
 *
 *  Для опредления тела операции используйте лямбда выражения
 *  Например:
 *  Calculator calc = new Calculator();
 *  calc.add("sum", (a,b) -> a+b);
 *  calc.calculate("sum",2,3);// выводит 5
 */
public class Task11 {
    public static void main(String[] args) {
        Person.main();
        Calculator.main();
    }
}
