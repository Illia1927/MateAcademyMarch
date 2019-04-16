package mate.academy.homeWork1.homeEx7;

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Fiolet");
        Person person = new Person("Illia", 21, car);

        Person clone = (Person) person.clone();

        System.out.println(person);
        System.out.println(clone);

        clone.setName("Maria");
        clone.setCar(new Car("Red"));

        System.out.println(clone);
    }
}
