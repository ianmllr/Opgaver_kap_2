import java.util.Scanner;
public class Opg_2_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Indtast længden på den ene side af din kvadrat.");

        int dinLængde = input.nextInt();

        double ditAreal = dinLængde * dinLængde; // udregner areal
        double dinOmkreds = dinLængde * 4; // udregner omkreds


        System.out.print("Arealet af kvadraten er " + ditAreal + " og omkredsen af kvadraten er " + dinOmkreds); // printer resultat


    }
}
