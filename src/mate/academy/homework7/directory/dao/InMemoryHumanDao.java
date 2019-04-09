package mate.academy.homework7.directory.dao;

import mate.academy.homework7.directory.annotation.Component;
import mate.academy.homework7.directory.model.Human;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryHumanDao implements HumanDao {
    private static final List<Human> inMemoryHumanDirectory = new ArrayList<>();

    @Override
    public void save(Human human) {
        inMemoryHumanDirectory.add(human);
    }

    @Override
    public List<Human> getHuman() {
        return inMemoryHumanDirectory;
    }
}
