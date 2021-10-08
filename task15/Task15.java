package tasks.task15;

import java.io.*;
import java.util.Scanner;

public class Task15
{
    public static void writeToFileFromKeyboard(String path, boolean appendMode) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        File file = new File(path);
        file.createNewFile();

        try {
            FileWriter fw = new FileWriter(file, appendMode);
            fw.write(text);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("No such file.");
            System.exit(1);
        }
    }

    public static String readFromFile(String path) throws IOException {
        File file = new File(path);

        String currLine = new String();
        StringBuilder fileData = new StringBuilder();

        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(file));

            while ((currLine = buffReader.readLine()) != null) {
                fileData.append(currLine);
            }
        } catch (IOException e) {
            System.out.println("No such file.");
            System.exit(1);
        }

        return fileData.toString();
    }

    public static void appendToFile(String path) {

    }

    public static void main(String[] args) throws IOException{
        writeToFileFromKeyboard("file.txt", false);

        String fileData = readFromFile("file.txt");
        System.out.println(fileData);

        writeToFileFromKeyboard("file.txt", false);
        fileData = readFromFile("file.txt");
        System.out.println(fileData);

        writeToFileFromKeyboard("file.txt", true);
    }
}
