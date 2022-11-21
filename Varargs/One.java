package Varargs;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        Concat("123", "234","345", "Э456");

    }
    public static void Concat(String ...str)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s: str)
        {
            stringBuilder
                    .append(s)
                    .append(" ");
        }
        System.out.println(stringBuilder);
    }
}
