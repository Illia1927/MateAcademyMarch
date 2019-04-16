package mate.academy.homework9.ex2;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StepikTwoTask {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.collect(Collectors.toList());
        minMaxConsumer.accept(list.stream()
                        .min(order)
                        .orElse(null),
                list.stream()
                        .max(order)
                        .orElse(null));
    }
}
