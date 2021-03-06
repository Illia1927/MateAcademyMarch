package mate.academy.homeWork6.deserialize;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Animal("Barsik");
        animals[1] = new Animal("Cat");
        animals[2] = new Animal("Vasya");
        animals[3] = new Animal("Petrik");

        byte[] byteArrayAnimals = new byte[0];
        byteArrayAnimals = Serializer.serialize(animals);
        System.out.println(Arrays.toString(animals));
        System.out.println("Serialization completed : " + Arrays.toString(byteArrayAnimals));

        Animal[] deserializeAnimal = new Animal[0];
        try {
            deserializeAnimal = (Animal[]) Serializer.deserialize(byteArrayAnimals);
        } catch (IOException e) {
            System.err.println("Can`t deserialize the array of bytes to array of objects");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Deserialization completed : " + Arrays.toString(deserializeAnimal));
    }
}
