//import java.io.*;
import java.util.Scanner;
public class MySalamu {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Enter another number");
        Scanner sc2 = new Scanner(System.in);
        int y = sc2.nextInt();
        System.out.println("The total is " + ((x) * (y)));
    }
}
