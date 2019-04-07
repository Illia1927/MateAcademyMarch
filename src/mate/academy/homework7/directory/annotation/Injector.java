package mate.academy.homework7.directory.annotation;

import mate.academy.homework7.directory.dao.ClientDao;
import mate.academy.homework7.directory.dao.FileClientDao;
import mate.academy.homework7.directory.dao.InMemoryClientDao;
import mate.academy.homework7.directory.factory.ClientDaoFactory;
import mate.academy.homework7.directory.handler.ConsoleHandler;

import java.lang.reflect.Field;

public class Injector {
    public static void injectDependency() throws IllegalAccessException {
        Class consoleHandlerClass = ConsoleHandler.class;
        Class fileClientDaoClass = FileClientDao.class;
        Class inMemoryClientDaoClass = InMemoryClientDao.class;

        Field[] fields = consoleHandlerClass.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                boolean fileDao = fileClientDaoClass.isAnnotationPresent(Component.class);
                if (fileDao) {
                    System.out.println("Work with file : " + fileDao);
                }
                boolean inMemoryDao = inMemoryClientDaoClass.isAnnotationPresent(Component.class);
                if (inMemoryDao) {
                    System.out.println("Work with memory : " + inMemoryDao);
                }
                ClientDao clientDao = ClientDaoFactory.getClienDao(fileDao, inMemoryDao);
                field.set(null, clientDao);
            }
        }
    }
}
