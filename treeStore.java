//tree store
import java.io.Console;

public class treeStore {

    public static void main(String[] args) {
        Console console = System.console();
        String stringAge = console.readLine("How old are you?  ");
        int age = Integer.parseInt(stringAge);
        if (age < 12) {
            console.printf("Sorry, you must be at least 13 to use this program \n");
            System.exit(0);
        }
        String noun = console.readLine("Enter a noun:  ");
        if (noun.equalsIgnoreCase("dork") ||
            noun.equalsIgnoreCase("jerk") ||
            noun.equalsIgnoreCase("nerd")) {
            console.printf("This language is not allowed. Exiting... \n\n");
            System.exit(0);
        }
        String name = console.readLine("Enter your name:  ");
        String adjective = console.readLine("Enter an adjective: ");
        console.printf("%s is very %s \n", name, adjective);
        
    }

}