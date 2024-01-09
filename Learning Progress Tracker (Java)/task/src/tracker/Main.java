package tracker;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Learning Progress Tracker");
        String line = null;
        while (true) {
            line = scanner.nextLine();
            if (line.trim().isEmpty()) {
                System.out.println("No input.");
            } else if (line.equals("exit")) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Error: unknown command!");
            }
        }
        scanner.close();
    }
}
