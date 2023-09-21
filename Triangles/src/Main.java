import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Triangles\n");
        Scanner in = new Scanner(System.in);
        System.out.print("What's the triangle's size, between 1 and 50?   ");
        while (!in.hasNextDouble()) {
            String word = in.next();
            System.out.println("\n" + word + " is not a number!");
            System.out.print("Enter a numeral length between 1 and 50: ");
        }
        int input = in.nextInt();
        if (input < 1) {
            System.out.println(input + " is not between 1 and 50!");
            System.out.println("Enter a length between 1 and 50: ");
            } else if (input > 50) {
            System.out.println(input + " is not between 1 and 50!");
            System.out.println("Enter a length between 1 and 50: ");
        }
        int lines = in.nextInt();
        for (int i = 1; i <= lines; i++) {
            for (int j = lines; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                }
            System.out.println();
    }}}