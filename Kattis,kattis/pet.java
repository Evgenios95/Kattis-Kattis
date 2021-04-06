import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class pet {
    public static void main(String[] args) throws Exception{
        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        int randomVariable = 0;
        int winnoPeto = 0;
        for(int i = 1; i < 6; i++){
            int sum = Arrays.stream(myReader.readLine().split(" ")).mapToInt((String s) -> Integer.parseInt(s)).sum();
            if(randomVariable < sum) {
                winnoPeto = i;
                randomVariable = sum;
            }
        }
        System.out.print(winnoPeto + " " + randomVariable);
    }
}