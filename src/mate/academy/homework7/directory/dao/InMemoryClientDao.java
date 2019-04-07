package mate.academy.homework7.directory.dao;

import mate.academy.homework7.directory.annotation.Component;
import mate.academy.homework7.directory.model.Client;

import java.util.ArrayList;
import java.util.List;
@Component
public class InMemoryClientDao implements ClientDao {

    private static final List<Client> inMemoryDirectory = new ArrayList<>();

    @Override
    public void save(Client client) {
    inMemoryDirectory.add(client);
    }

    @Override
    public Client get() {
        return inMemoryDirectory.get(0);
    }
}
