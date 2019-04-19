package mate.academy.homework11.regularExpresion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = getWord();
        workWithText(text);
    }

    static String getWord() {
        String result = " ";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            result = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    static void workWithText(String text) {
        Map<String, Integer> maps = new HashMap<>();
        Pattern pattern = Pattern.compile("\\b\\w+\\b", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String key = matcher.group().toLowerCase();
            if (maps.containsKey(key)) {
                maps.put(key, maps.get(key) + 1);
            } else {
                maps.put(key, 1);
            }
        }
        maps.keySet()
                .stream()
                .sorted(Comparator.naturalOrder())
                .sorted((o1, o2) -> maps.get(o2) - maps.get(o1))
                .limit(10)
                .forEach(System.out::println);
    }
}
