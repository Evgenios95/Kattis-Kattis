import java.util.Scanner;

public class LastFactorialDigit {
    public static void main(String[] args) {

        // katarxas ftiaxnw to scanner. System.in shmainei oti prepei na perasoume to input ston constructor ths class
        Scanner factorial = new Scanner(System.in);
        //to factorial tha einai h metavlhth sthn opoia tha paei to scanner kai tha apothikeytei. 
        //to numberOnTerminal einai o arithmos tou opoiou ton factorial prepei na broume
        int numberOnTerminal = factorial.nextInt();
        // to i einai o artithmos pou thelw kai o fact tha einai o factorial tou arithmou
        int fact=1;
        int i =1 ;

        while (i<=numberOnTerminal){
            fact = fact * i ;
            i++;
        }
        System.out.println(fact);

    }}