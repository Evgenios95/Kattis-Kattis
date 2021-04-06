import java.util.Scanner;

public class coldScience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberCases = sc.nextInt();

        int x,k=0;
        for(int i = 0; i < numberCases; i++){
            x = sc.nextInt();
            if (x < 0){
                k++;
            }
        } System.out.println( k );
    }
}
