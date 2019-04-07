package mate.academy.homework7.directory.factory;

import mate.academy.homework7.directory.service.PropertieLoader;
import mate.academy.homework7.directory.dao.ClientDao;
import mate.academy.homework7.directory.dao.FileClientDao;
import mate.academy.homework7.directory.dao.InMemoryClientDao;

import java.io.IOException;

public class ClientDaoFactory {

    private static final ClientDao inMemoryDao = new InMemoryClientDao();
    private static final ClientDao fileDao = new FileClientDao();

    public static ClientDao getClienDao(boolean isFileDao, boolean isMemoryDao) {
        try {
            String dbName = PropertieLoader.getPropertie("db.bame");
            if (dbName.equals("memory") && isFileDao) {
                return inMemoryDao;
            }
        } catch (IOException e) {
            System.err.println("Don`t have a access to file");
        }
        if (isFileDao) {
            return fileDao;
        } else {
            throw new ComponentNotFoundException();
        }
    }
}
