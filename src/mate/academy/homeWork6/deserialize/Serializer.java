package mate.academy.homeWork6.deserialize;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer {

    public static byte[] serialize(Object obj) {
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        ObjectOutputStream o = null;
        try {
            o = new ObjectOutputStream(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            o.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return b.toByteArray();
    }

    public static Object deserialize(byte[] bytes) throws IOException, ClassNotFoundException, IllegalArgumentException {
        try (ByteArrayInputStream b = new ByteArrayInputStream(bytes)) {
            try (ObjectInputStream o = new ObjectInputStream(b)) {
                return o.readObject();
            }
        }
    }
}
