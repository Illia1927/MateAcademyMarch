package mate.academy.homeWork6.colection;

import java.util.HashSet;
import java.util.Set;

public class Colection {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);

        Set<Integer> s2 = new HashSet<>();
        s2.add(0);
        s2.add(1);
        s2.add(2);

        Set<Integer> result = diff(s1, s2);

        System.out.println(result);
    }
    private static <T> Set<T> diff(final Set<? extends T> s1, final Set<? extends T> s2) {
        Set<T> symmetricDiff = new HashSet<>(s1);
        symmetricDiff.addAll(s2);
        Set<T> tmp = new HashSet<>(s1);
        tmp.retainAll(s2);
        symmetricDiff.removeAll(tmp);
        return symmetricDiff;
    }
}
