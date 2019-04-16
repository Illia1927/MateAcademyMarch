package mate.academy.homework7.directory.dao;

import mate.academy.homework7.directory.annotation.Component;
import mate.academy.homework7.directory.model.Human;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

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
    public List<Human> getHuman() {
        List<Human> humans = new ArrayList<>();
        Human readFileTxt;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("HumanDirectory.txt"))) {
            while ((readFileTxt = (Human) objectInputStream.readObject()) != null) {
                humans.add(readFileTxt);
            }
            return humans;
        } catch (EOFException e) {
            return humans;
        } catch (Exception e) {
            throw new HumanNotFoundExeption();
        }
    }
}
