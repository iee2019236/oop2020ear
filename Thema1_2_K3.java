import java.util.Scanner;

public class Thema1_2_K3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dwse hlikia:");
        int hlikia = input.nextInt();
        input.close();
        Hlika_Check(hlikia);
    }

    public static void Hlika_Check(int x) {
        if (x <= 0)
            throw new ArithmeticException("Lathos Hlikia");
        else
            System.out.println("Swsti hlikia");
    }
}