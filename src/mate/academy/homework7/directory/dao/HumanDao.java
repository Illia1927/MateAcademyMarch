package mate.academy.homework7.directory.dao;

import mate.academy.homework7.directory.model.Human;

import java.util.List;

public interface HumanDao {
    void save(Human human);

    List<Human> getHuman();
}
