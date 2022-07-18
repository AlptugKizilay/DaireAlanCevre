import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, pi = 3.14;
        double u, alan;


        Scanner inp = new Scanner(System.in);
        System.out.print("Yarı çap uzunuluğunu giriniz: ");
        r = inp.nextDouble();
        u = 2*pi*r;
        alan = pi*r*r;


        System.out.println("Cevre: "+ u);
        System.out.println("Alan: "+ alan);

    }
}