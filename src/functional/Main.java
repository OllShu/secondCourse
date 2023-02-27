package functional;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        Statement[] statements = new Statement[] {new Statement("Иванов Семен", 10),
                                            new Statement("Петров Иван", 11),
                                            new Statement("Соколов Федор", 6)};
        Stream<Statement> statementStream = Arrays.stream(statements);
        BiConsumer <Statement, Statement> minMaxConsumer = (min, max) -> System.out.println("больше всего долгов у "+min.toString()+
                ", меньше всего долгов у "+max.toString());
        Comparator<Statement> statementComparator = Comparator.comparing(Statement::getCreditedWorks).
                thenComparing(Statement::getStudentName);
        findMinMax(statementStream, statementComparator, minMaxConsumer);

    //  вторая задача

    ArrayList<Integer> listNumbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                listNumbers.add(getNumber());
            }
        System.out.println(listNumbers);
        findNumberOfEvenNumbers(listNumbers);
    }
    public static void findNumberOfEvenNumbers (ArrayList<Integer> arrayList) {     // метод ко второй задаче
       arrayList.stream().filter(x -> x % 2==0)
               .forEach(System.out::println);

    /*    public static void findNumberOfEvenNumbers (ArrayList arrayList) {     //первый вариант
            Stream stream = arrayList.stream();
            Predicate <Integer> predicate = x -> x % 2==0;
            stream.filter(predicate)
                    .forEach(s-> System.out.println(s));

     */

    }

    public static int getNumber() {

        Random random = new Random();
        return random.nextInt();
    }

    public static <T> void findMinMax(Stream <? extends T> stream,      // метод к первой задаче
                                      Comparator <? super T> order,
                                      BiConsumer <? super T, ? super T> minMaxConsumer){
        List<T> list = stream.collect(Collectors.toList());
        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            list.sort(order);
            minMaxConsumer.accept(list.get(0), list.get(list.size()-1) );
        }
    }

    /*     дубль, который не получился
    public static <T> void findMinMax(Stream <? extends T> stream,
                                      Comparator <? super T> order,
                                      BiConsumer <? super T, ? super T> minMaxConsumer){
    Optional<? extends T> opt = stream.findFirst();
        if (opt==Optional.empty()) {
        minMaxConsumer.accept(null, null);
    } else {
       minMaxConsumer.accept(stream.min(order::compare).get(),stream.max(order::compare).get());

     */



/*        List<Integer> integerList = Arrays.asList(
                getNumber(),
                getNumber(),
                getNumber(),
                getNumber()
        );

        Predicate<Integer> PositiveNumberPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer >= 0) return true;
                else return false;
            }
        };
        Predicate<Integer> PositiveNumberPredicate1 = x -> x>0;

        System.out.println(integerList);
        for (Integer integer: integerList) {
            System.out.println(PositiveNumberPredicate.test(integer));
            System.out.println(PositiveNumberPredicate1.test(integer));
        }

        String name = "Маша";

        Consumer<String> WriteGreetingConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Привет, " + s);
            }
        };

        Consumer<String> WriteGreetingConsumer1 = s -> System.out.println("Привет, " + s);

        WriteGreetingConsumer.accept(name);
        WriteGreetingConsumer1.accept(name);

        double number = 12.333;

        Function<Double, Long> RoundingFunction = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };

        Function<Double, Long> RoundingFunction1 = aDouble -> Math.round(aDouble);

        System.out.println(number+" округляем до "+RoundingFunction.apply(number));
        System.out.println(number+" округляем до "+RoundingFunction1.apply(number));

        Supplier<Integer> NumberGeneratorSupplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random()*101);
            }
        };

        Supplier<Integer> NumberGeneratorSupplier1 = () -> (int) (Math.random()*101);

        System.out.println("Случайное число в диапазоне от 0 до 100 - "+NumberGeneratorSupplier.get());
        System.out.println("Случайное число в диапазоне от 0 до 100 - "+NumberGeneratorSupplier1.get());
    }

    public static int getNumber() {

        Random random = new Random();
        return random.nextInt();
    }

 */
}


