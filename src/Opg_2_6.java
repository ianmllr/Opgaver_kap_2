import java.util.Scanner;
public class Opg_2_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast et antal timer.");

        int xTimer = input.nextInt(); // modtager input fra brugeren

        int xSekunder = (xTimer * 3600); // regner timer om til sekunder

        System.out.print(xTimer + " timer svarer til " + xSekunder + " sekunder."); // printer resultat


    }
}
