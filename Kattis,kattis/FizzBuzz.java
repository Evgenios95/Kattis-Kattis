import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner (System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int N = sc.nextInt();

    int i;
    for (i=1; i<=N; i++){
        if (i % Y  == 0 && i % X == 0){
            System.out.println("FizzBuzz");
        } else if (i % Y  == 0){
            System.out.println("Buzz");
        } else if (i % X == 0){
            System.out.println("Fizz");
        } else {
            System.out.println(i);}
    }
}}
