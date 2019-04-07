package mate.academy.homework7.directory.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PropertieLoader {

    public static String getPropertie(String name) throws IOException {
        Path propertie = Paths.get("application.properties");
        String propertyFileString = new String(Files.readAllBytes(propertie));
        String result = propertyFileString.split("=")[1];
        return result;
    }
}
