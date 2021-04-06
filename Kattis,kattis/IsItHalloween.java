import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// giving input to a program. feeding information afteri its started.
        String line = sc.nextLine(); //we store it in importantLine. to nextline tha diavasei mono to line.
        sc.close(); // stop giving back info. i dont want leaks.

        if(line.equals("OCT 31") || line.equals("DEC 25")){
            System.out.println("yup");

        } else {

            System.out.println("nope");
        }
    
    }
}