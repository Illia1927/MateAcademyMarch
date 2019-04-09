package mate.academy.homework7.directory.factory;

import mate.academy.homework7.directory.dao.FileHumanDao;
import mate.academy.homework7.directory.dao.HumanDao;
import mate.academy.homework7.directory.dao.InMemoryHumanDao;
import mate.academy.homework7.directory.service.PropertieLoader;

import java.io.IOException;

public class HumanDaoFactory {
    private static final HumanDao fileHumanDao = new FileHumanDao();
    private static final HumanDao inMemoryHumanDao = new InMemoryHumanDao();

    public static HumanDao getHumanDao(boolean isFileHumanDao, boolean isInMemoryHumanDao) {
        try {
            String dbHumanName = PropertieLoader.getPropertie("db.name.human");
            if (dbHumanName.equals("memory") && isInMemoryHumanDao) {
                return inMemoryHumanDao;
            }
        } catch (IOException e) {
            System.err.println("Don`t have a access to file");
        }
        if (isFileHumanDao) {
            return fileHumanDao;
        } else {
            throw new ComponentNotFoundException();
        }
    }
}
