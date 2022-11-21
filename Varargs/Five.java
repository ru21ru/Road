package Varargs;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 25; i++) {
            System.out.println(i + " : " + Func(i));
        }
          sc.close();
        }


    public static int Func(int n) {
        int[] array = new int[1];
        array[0] = 0;
        SimpleNum(n, n, array);
        return array[0];
    }
    static boolean SimpleNum(int number, int counter, int[] sum){

        if (number == 1) {
            return false;
        } else if ((number % counter == 0) && (number != counter) && counter != 1) {
            return false;
        }
        else if (counter == 1){
            sum[0] = sum[0] + number;
            return true;
        }


            return SimpleNum(number, counter - 1, sum);
        }

    }

