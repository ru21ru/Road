package Static;

import java.util.Scanner;

public class SimpleClassMain {
    public static void main(String[] args) {
        int quantity;
        int[] array;
        Scanner sc = new Scanner(System.in);
        quantity = sc.nextInt();

        SimpleNumber simpleNumbers = new SimpleNumber(quantity);

        array = SimpleNumber.find();

        for (int number: array) {
            System.out.println(number);
        }

    }
}
