package mate.academy.homeWork6.generic;

public class Main {
    public static void main(String[] args) {
        Pair<String, String> pair = Pair.of("First", "Second");
        String first = pair.getFirst();
        String second = pair.getSecond();

        System.out.println(first);
        System.out.println(second);

        Pair<String, String> secondPair = Pair.of("First", "Second");

        boolean equals = pair.equals(secondPair);
        boolean hashcode = pair.hashCode() == secondPair.hashCode();

        System.out.println(equals);
        System.out.println(hashcode);
    }
}
