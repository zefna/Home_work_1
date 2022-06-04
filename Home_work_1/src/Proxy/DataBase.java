package Proxy;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class DataBase implements LocalhostReader {

    @Override
    public String getDataBase(String DataBase) throws IOException {
//        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(name: "localhost.txt");
        System.out.println("Читаем адрес базы данных из файла");
        String s1 = new String(Files.readAllBytes(FileSystems.getDefault().getPath("localhost.txt")));
        String fullDirectory = s1 + DataBase;
        System.out.println("Directory: " + fullDirectory);
        return fullDirectory;
    }
}
