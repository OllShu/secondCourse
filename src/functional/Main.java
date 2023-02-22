package functional;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(
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
}


