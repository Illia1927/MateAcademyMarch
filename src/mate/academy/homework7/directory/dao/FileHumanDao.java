package mate.academy.homework7.directory.dao;

import mate.academy.homework7.directory.annotation.Component;
import mate.academy.homework7.directory.model.Human;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
@Component
public class FileHumanDao implements HumanDao {
    @Override
    public void save(Human human) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("HumanDirectory.txt"));
            objectOutputStream.writeObject(human);
        } catch (IOException e) {
            System.err.println("failed to write to database!");
        }
    }

    @Override
    public Human getHuman() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("HumanDirectory.txt"));
            return (Human) objectInputStream.readObject();
        } catch (Exception e) {
            System.err.println("Human not found in system");
        }
        return null;
    }
}
