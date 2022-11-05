package HW12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork12 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/Users/alina/Documents//romeo-and-juliet.txt");
        StringBuilder builder = new StringBuilder();
        int c = -1;
        while ((c = reader.read()) != -1) {
            builder.append((char) c);
        }
        reader.close();
        String line = builder.toString().replace(",", " ")
                .replace("'", " ")
                .replace("?", " ")
                .replace("!", " ")
                .replace("[", " ")
                .replace("]", " ")
                .replace("(", " ")
                .replace(")", " ")
                .replace(".", " ")
                .replace("=", " ")
                .replace("-", " ")
                .replace("\n", " ");
        String[] lines = line.split(" ");
        String maxLength = lines[0];
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].length() > maxLength.length()) {
                maxLength = lines[i];
            }
        }
        FileWriter writer = new FileWriter("/Users/alina/Documents//R-J.txt");
        writer.write(maxLength);
        writer.close();
    }
}
