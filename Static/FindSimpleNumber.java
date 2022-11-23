package Static;

import java.util.Scanner;

class SimpleNumber {
    protected static int[] primeNumbers;

    public static void main(String[] args) {
        int quantity;
        int[] array;
        Scanner sc = new Scanner(System.in);
        quantity = sc.nextInt();

        SimpleNumber simpleNumbers = new SimpleNumber(quantity);

        array = SimpleNumber.find();

        for (int number: array) {
            System.out.println("Прострое число:" + number);
        }

        System.out.println("Сумма простых числе:" + simpleNumbers.sum());
    }

public SimpleNumber(int quantity){
    primeNumbers = new int[quantity];
}

public static int[] find(){

    for (int i = 0; i < primeNumbers.length; i++) {
        if (i == 0) {
            primeNumbers[i] = 2;
        } else {
            int addingValue = i == 1 ? 1 : 2;
            int number = primeNumbers[i - 1] + addingValue;
            primeNumbers[i] = findNextPrimeNumber(number, i);
        }
    }

    return primeNumbers;
}
public static int sum(){
    int[] array;
    int sum = 0;
    array = find();
    for (int num: array) {
        sum += num;
    }
    return sum;
}

public static int findNextPrimeNumber(int number, int currentIndex) {
        boolean isPrime = isPrime(number, currentIndex);

        if (isPrime) {
            return number;
        }


        number += 2;

        return findNextPrimeNumber(number, currentIndex);
    }

    //    Метод проверки конкретного числа на то, является ли оно простым
    static boolean isPrime(int number, int currentIndex) {
        int j = 0;
        boolean isPrime = true;

        while (isPrime && j < currentIndex && number / primeNumbers[j] > 1) {
            if (number % primeNumbers[j] == 0) {
                isPrime = false;
            } else {
                j++;
            }
        }
        return isPrime;
    }
}
