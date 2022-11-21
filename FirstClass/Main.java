package FirstClass;

public class Main {
    public static void main(String[] args) {
        Counter even = new Counter("Четное", 0);
        Counter odd = new Counter("Не четное", 0);

        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 0) {
                even.inc();
            }
             else{
                odd.inc();
                }
            }
        System.out.println("Четные:" + even.getConut());
        System.out.println("Не четные:" + odd.getConut());
        }
    }

