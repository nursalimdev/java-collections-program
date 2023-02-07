package nursalim.dev.collection.program.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ResourceApp {
    public static void main(String[] args) throws FileNotFoundException {

        // old way, but when deploy to other machine will raised an error file not found
//        File file = new File("src/main/resources/artikel.txt");
//        FileInputStream inputStream = new FileInputStream(file);

        // the solution is using ResourceApp.class.getResourceAsStream() method
        InputStream resourceAsStream = ResourceApp.class.getResourceAsStream("/artikel.txt");
        printFile(resourceAsStream);
    }

    private static void printFile(InputStream inputStream){
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
