package mate.academy.homework7.directory.dao;

import mate.academy.homework7.directory.model.Human;

public interface HumanDao {
    void save(Human human);

    Human getHuman();
}
