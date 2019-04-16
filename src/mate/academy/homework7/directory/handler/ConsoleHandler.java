package mate.academy.homework7.directory.handler;

import mate.academy.homework7.directory.annotation.Inject;
import mate.academy.homework7.directory.dao.ClientDao;
import mate.academy.homework7.directory.model.Client;

import java.util.Scanner;

public class ConsoleHandler {

    @Inject
    private static ClientDao clientDao;

    public static void handle() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do the choice(Press button) : ");
            System.out.println("1 - if you wright the client, 2 - if you want get info of client, 3 - for exit : ");
            int consoleChoise = scanner.nextInt();
            switch (consoleChoise) {
                case 1:
                    addClientInfo(scanner);
                    break;
                case 2:
                    System.out.println(clientDao.get());
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void addClientInfo(Scanner scanner) {
        System.out.println("Input info of client : ");
        System.out.println("Input name : ");
        String name = scanner.next();
        System.out.println("Input phone number : ");
        String phoneNumber = scanner.next();
        Client client = new Client(name, phoneNumber);
        clientDao.save(client);
    }
}
