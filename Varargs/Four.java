package Varargs;

public class Four {
    public static void main(String[] args) {
        System.out.println(Koren(3,1));
    }
    public static double Koren(int n, double rez)
    {
        if (n == 1) return 1;

        return Math.sqrt(n) + Koren(n-1 ,Math.sqrt(n-1));

    }

}
