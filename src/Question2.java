import java.util.Scanner;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question2 {
    //Ask a user to add in a number, save it to a variable and print out that variable.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Please enter a number: ");
        number = input.nextInt();
        System.out.println("Your number is: " + number);
    }
}
