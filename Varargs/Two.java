package Varargs;

public class Two {
    public static void main(String[] args) {

        System.out.println(Sum((byte) 1,(byte)2,(byte)127));
        System.out.println(Sum(true,true,true));
        System.out.println(Sum(true,true,true,false));
        System.out.println(Sum((char)'a', (char)'b', (char) 'c'));
    }
    public static byte Sum(byte ...num)
    {
        int sum = 0;
        for (Byte b: num)
        {
            sum = sum + b;
            if (sum > Byte.MAX_VALUE)
            {
                System.out.println("Переполнение в +");
            }
            else if (sum < Byte.MIN_VALUE)
                {
                    System.out.println("Переполнение в -");
                }

        }
        return (byte) sum;
    }
    public static short Sum(short ...num)
    {
        int sum = 0;
        for (short b: num)
        {
            sum = sum + b;
            if (sum > Short.MAX_VALUE)
            {
                System.out.println("Переполнение в +");
            }
            else if (sum < Short.MIN_VALUE)
            {
                System.out.println("Переполнение в -");
            }

        }
        return (short) sum;
    }
    public static int Sum(int ...num)
    {
        long sum = 0;
        for (int b: num)
        {
            sum = sum + b;
            if (sum > Integer.MAX_VALUE)
            {
                System.out.println("Переполнение в +");
            }
            else if (sum < Integer.MIN_VALUE)
            {
                System.out.println("Переполнение в -");
            }

        }
        return (int) sum;
    }
    public static long Sum(long ...num)
    {
        long sum = 0;
        for (long b: num)
        {
            sum = sum + b;
        }
        return (int) sum;
    }

    public static boolean Sum(boolean ...num)
    {
        boolean sum = true;
        for (boolean b: num)
        {
            sum = sum && b;
        }
        return (boolean) sum;
    }
    public static String Sum(char ...num)
    {
        String sum = "";
        for (char b: num)
        {
            sum = sum.concat(String.valueOf(b));
        }
        return sum;
    }
}
