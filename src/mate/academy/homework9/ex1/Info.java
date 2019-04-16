package mate.academy.homework9.ex1;

public class Info<T> {
    private String from;
    private String to;
    private T content;

    public Info(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public T getContent() {
        return content;
    }
}
