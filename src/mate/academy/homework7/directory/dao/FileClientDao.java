package mate.academy.homework7.directory.dao;

import mate.academy.homework7.directory.annotation.Component;
import mate.academy.homework7.directory.model.Client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
@Component
public class FileClientDao implements ClientDao {
    @Override
    public void save(Client client) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("directory.txt"));
            objectOutputStream.writeObject(client);
        } catch (IOException e) {
            System.err.println("failed to write to database!");
        }
    }

    @Override
    public Client get() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("directory.txt"));
            return (Client) objectInputStream.readObject();
        } catch (Exception e) {
            System.err.println("Client not found in system");
            return null;
        }
    }
}
