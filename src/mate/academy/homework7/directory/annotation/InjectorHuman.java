package mate.academy.homework7.directory.annotation;

import mate.academy.homework7.directory.dao.FileHumanDao;
import mate.academy.homework7.directory.dao.HumanDao;
import mate.academy.homework7.directory.dao.InMemoryHumanDao;
import mate.academy.homework7.directory.factory.HumanDaoFactory;
import mate.academy.homework7.directory.handler.ConsoleHandlerHuman;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class InjectorHuman {
    private static final List<Class> listOfClass = new ArrayList<>();

    public static void injectDependency() throws IllegalAccessException {
        classList();

        Field[] fields = listOfClass.get(0).getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                boolean fileHumanDao = true;
                boolean inMemoryHumanDao = true;
                for (Class clazz : listOfClass) {
                    if (clazz.getSimpleName().equals("file" + field.getType().getSimpleName())) {
                        fileHumanDao = listOfClass.get(listOfClass.indexOf(clazz))
                                .isAnnotationPresent(Component.class);
                    }
                    if (clazz.getSimpleName().equals("inMemory" + field.getType().getSimpleName())) {
                        inMemoryHumanDao = listOfClass.get(listOfClass.indexOf(clazz))
                                .isAnnotationPresent(Component.class);
                    }
                }
                if (fileHumanDao) {
                    System.out.println("Work with file : " + fileHumanDao);
                }
                if (inMemoryHumanDao) {
                    System.out.println("Work with memory : " + inMemoryHumanDao);
                }
                HumanDao humanDao = HumanDaoFactory.getHumanDao(fileHumanDao, inMemoryHumanDao);
                field.set(null, humanDao);
            }
        }
    }

    private static void classList() {
        listOfClass.add(ConsoleHandlerHuman.class);
        listOfClass.add(FileHumanDao.class);
        listOfClass.add(InMemoryHumanDao.class);
    }
}
