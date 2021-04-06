import java.util.Scanner;

public class judgingmoose {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();

        //math max prints the higher value. So the higher value is R or L multiplied by 2
        int mooseNum= Math.max(l, r) *2;

        if (mooseNum == 0) {
            System.out.println("Not a moose");
        } else if (l==r){
            System.out.println("Even " +mooseNum);
        } else {
            System.out.println("Odd " + mooseNum); 
        }
        
        scanner.close();
    }
}
