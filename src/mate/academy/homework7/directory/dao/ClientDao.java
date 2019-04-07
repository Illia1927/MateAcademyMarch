package mate.academy.homework7.directory.dao;

import mate.academy.homework7.directory.model.Client;

public interface ClientDao {
    void save(Client client);

    Client get();
}
