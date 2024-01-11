package tracker;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Learning Progress Tracker");
        baseMenu(scanner);
        scanner.close();
    }

    private static void baseMenu(Scanner scanner) {
        while (true) {
//            String line;
            String line = scanner.nextLine();
            if (line.trim().isEmpty()) {
                System.out.println("No input.");
            } else if (line.equals("add students")){
                System.out.println("Enter student credentials or 'back' to return");
            }


            else if (line.equals("exit")) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Error: unknown command! ");
            }
        }
    }
}
