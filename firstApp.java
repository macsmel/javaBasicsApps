//java package input/output
import java.io.Console;

public class firstApp {

    public static void main(String[] args) {
        Console console = System.console();
        //Welcome to the intdoduction program!
        String firstName = console.readLine("What is your name?  ");
        console.printf("Hello, my name is %s \n", firstName);
        console.printf("%s is learning how to write Java \n", firstName);
    }

}