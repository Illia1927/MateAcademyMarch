package mate.academy.homework9.ex3;

import java.util.stream.IntStream;

public class StepikThreeTask {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ((n * n) / 10) % 1000);
    }

    public static void main(String[] args) {

        IntStream useLimit = pseudoRandomStream(13);
        useLimit.limit(7).forEach(System.out::println);
    }
}
