package mate.academy.homework9.ex1;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Info<T>> {
    private Map<String, List<T>> mailBox;

    public MailService() {
        mailBox = new TreeMap<String, List<T>>() {
            @Override
            public List<T> get(Object key) {
                return super.get(key);
            }
        };
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(Info<T> Info) {
        List<T> list = mailBox.get(Info.getTo());
        list.add(Info.getContent());
        mailBox.put(Info.getTo(), list);
    }
}
