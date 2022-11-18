package Methods;

/*
Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
Углы прямоугольника обозначить символом “ “.
Каждая единица длины должна обозначаться одним символом “-“,
каждая единица ширины – символом “|“.
*/
public class Task3 {
    public static void main(String[] args) {
        PrintKvadrat(5,5);
    }
    public static void PrintKvadrat(int length, int width)
    {
        PrintLine(length,width,"_", ".",1);
        PrintLine(length,width," ", "|" , width-2);
        PrintLine(length,width,new String(Character.toString(0x203E)),"`", 1);
    }
    public static void PrintLine(int length, int width, String  strBody, String side, int rep)
    {
        System.out.print((side + strBody.repeat(length-2) + side + "\n").repeat(rep));
    }
}
