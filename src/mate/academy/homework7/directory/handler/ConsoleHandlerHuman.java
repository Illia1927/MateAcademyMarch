package mate.academy.homework7.directory.handler;

import mate.academy.homework7.directory.annotation.Inject;
import mate.academy.homework7.directory.dao.HumanDao;
import mate.academy.homework7.directory.model.Human;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class ConsoleHandlerHuman {
    @Inject
    private static HumanDao humanDao;

    public static void handle(){
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do the choice(Press button) : ");
            System.out.println("1 - if you wright the human, 2 - if you want get info of human, 3 - for exit : ");
            int consoleChoise = scanner.nextInt();
            switch (consoleChoise) {
                case 1:
                    addHunamInfo(scanner);
                    break;
                case 2:
                    System.out.println(humanDao.getHuman());
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void addHunamInfo(Scanner scanner) {
        System.out.println("Input info of human : ");
        System.out.println("Input name : ");
        String humanName = scanner.next();
        System.out.println("Input sur name : ");
        String humanSurName = scanner.next();
        Human.Sex humanSex = Human.Sex.MALE;
        System.out.println("Input year of birth : ");
        int year = scanner.nextInt();
        System.out.println("Input month : ");
        int month = scanner.nextInt();
        System.out.println("Input day : ");
        int dayOfMonth = scanner.nextInt();
        LocalDate localDate = LocalDate.of(year, month, dayOfMonth);
        Human human = new Human(humanName, humanSurName, humanSex, localDate);
        humanDao.save(human);
    }
}
