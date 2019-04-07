package mate.academy.homework7.directory;

import mate.academy.homework7.directory.annotation.Injector;
import mate.academy.homework7.directory.handler.ConsoleHandler;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Injector.injectDependency();
        ConsoleHandler.handle();
    }
}
