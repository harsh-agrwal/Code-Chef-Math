import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int x = sc.nextInt();
            int n = sc.nextInt();
            int eachTestPoints = x / 10;
            int chefScore = n * eachTestPoints;
            System.out.println(chefScore);
        }
        
        sc.close();
    }
}
