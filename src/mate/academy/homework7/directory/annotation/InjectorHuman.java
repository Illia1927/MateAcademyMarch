package mate.academy.homework7.directory.annotation;

import mate.academy.homework7.directory.dao.FileHumanDao;
import mate.academy.homework7.directory.dao.HumanDao;
import mate.academy.homework7.directory.dao.InMemoryHumanDao;
import mate.academy.homework7.directory.factory.HumanDaoFactory;
import mate.academy.homework7.directory.handler.ConsoleHandlerHuman;

import java.lang.reflect.Field;

public class InjectorHuman {
    public static void injectDependency() throws IllegalAccessException {

        Class consoleHumanHandlerClass = ConsoleHandlerHuman.class;
        Class fileHumaDaoClass = FileHumanDao.class;
        Class inMemoryHumanDaoClass = InMemoryHumanDao.class;

        Field[] fields = consoleHumanHandlerClass.getDeclaredFields();

        for (Field field : fields) {
            if(field.isAnnotationPresent(Inject.class)){
                field.setAccessible(true);
                boolean fileDao = fileHumaDaoClass.isAnnotationPresent(Component.class);
                if(fileDao){
                    System.out.println("Work with file : " + fileDao);
                }
                boolean inMemoryDao = inMemoryHumanDaoClass.isAnnotationPresent(Component.class);
                if(inMemoryDao){
                    System.out.println("Work with memory : " + inMemoryDao);
                }
                HumanDao humanDao = HumanDaoFactory.getHumanDao(fileDao, inMemoryDao);
                field.set(null, humanDao);
            }
        }
    }
}
