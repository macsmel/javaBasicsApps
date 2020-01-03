//tree store
import java.io.Console;

public class treeStore {

    public static void main(String[] args) {
        Console console = System.console();

        String name = console.readLine("Enter your name:  ");
        String adjective = console.readLine("Enter an adjective: ");
        console.printf("%s is very %s \n", name, adjective);
        
    }

}