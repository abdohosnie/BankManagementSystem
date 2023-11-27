package BankManagementSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    // Specify the directory path where your data files are located
    private static final String DATA_DIRECTORY = "data/";

    public static List<String> readData(String fileName) throws IOException {
        List<String> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_DIRECTORY + fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
        }

        return data;
    }

    public static void writeData(String fileName, List<String> data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_DIRECTORY + fileName))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}


