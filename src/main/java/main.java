import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        String numbers = input.nextLine();
        for(String number: numbers.split(" "))
        {
            int value = Integer.parseInt(number);
            String hex = Integer.toHexString(value);
            System.out.println(hex);
        }
    }
}
