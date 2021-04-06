import java.util.Scanner;

public class timeloop {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        for (int i = 1; i <= number; i++) {
            System.out.println("" + i +" Abracadabra");
        }
    }
}
