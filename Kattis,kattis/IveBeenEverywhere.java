import java.util.HashSet;
import java.util.Scanner;

public class IveBeenEverywhere {
    public static void main(String[] args) {
        Scanner yo = new Scanner(System.in);
        int numberOfTestCases = yo.nextInt();
        
        for (int i=0; i<numberOfTestCases; i ++){

            HashSet<String> mySet= new HashSet<>();
            int citiesVisited = yo.nextInt();
            yo.nextLine();
            for ( int k = 0; k < citiesVisited; k++)
                mySet.add(yo.nextLine());
                System.out.println(mySet.size());
                
        }
}
}