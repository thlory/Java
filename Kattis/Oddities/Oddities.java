//https://open.kattis.com/problems/oddities
import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            if ((i % 2) == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
        sc.close();
    }
    
}
