package Arrays;

import java.sql.Array;
import java.util.Scanner;

public class HomeWork {
    public static void ZadachaOne()
    {
        //char[] name = new char[] {'D','m','i','t','r','y'};
        char[] name = {'D','m','i','t','r','y'};
        String s = "";
        System.out.print("Metod 1: ");
        for (char ch: name)
        {
            s = s + ch;
            System.out.print(ch);
        }
        System.out.println("\nMetod 2: " + s);
    }
    public static void ZadachaTwo()
    {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        int sum = 0;
        for (int index = 0; index < number.length ; index++)
            {
                number[index] = sc.nextInt();
                sum = sum + number[index];
                System.out.println(sum);
            }

    }
    public static void ZadachaThree()
    {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        int sum, num, index;
        index = 0;
        sum = 0;
        num = 0;
        //for (int index = 0; index < number.length; index++)

        while (index < number.length)
        {
            num = sc.nextInt();
            if (SimpleNumber(num))
            {
                sum = sum + num;
                number[index] = num;
                index++;
                System.out.println(num + " Сумма:" + sum);
            }

        }
        sc.close();

    }
    public static boolean SimpleNumber(int number)
    {
        boolean result;
        result = false;
        for (int i = 2; i <= number; i++) {
            if ((number % i == 0) && (number != i))
            {
                result = true;
            }
        }
        return  (result == false) || (number == 1);
    }
    public static void main(String[] args) {
        ZadachaOne();
        ZadachaTwo();
        ZadachaThree();
    }
}
