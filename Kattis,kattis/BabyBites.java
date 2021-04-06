import java.util.Scanner;

public class BabyBites{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        String []arr = sc.nextLine().split(" ");
        
        boolean myBoolean = false;
        
        for (int i = 1; i < arr.length; i++){
            if (arr[i].equals("mumble")  || arr[i].equals(Integer.toString(i+1)))
            continue;
            myBoolean=true; 

            }

            String results = myBoolean ? "something is fishy" : "makes sense";
            System.out.println(results);
            sc.close();



            

        }
        
        
    }
