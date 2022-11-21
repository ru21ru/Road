package Varargs;

public class Three {
    public static void main(String[] args) {
        System.out.println(Fuc(3));
    }
    public static int Fuc(int num)
    {
        if (num == 1) return 1;

        return num * Fuc(num - 1);
    }
}
