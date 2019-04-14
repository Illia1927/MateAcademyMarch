package mate.academy.homework9.ex1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<ClassForMailAndSalary<T>> {
    private Map<String, List<T>> mailBox;

    public MailService() {
        mailBox = new HashMap<String, List<T>>() {
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
    public void accept(ClassForMailAndSalary<T> ClassForMailAndSalary) {
        List<T> list = mailBox.get(ClassForMailAndSalary.getTo());
        list.add(ClassForMailAndSalary.getContent());
        mailBox.put(ClassForMailAndSalary.getTo(), list);
    }
}
