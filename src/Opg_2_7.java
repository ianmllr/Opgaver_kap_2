import java.util.Scanner;
public class Opg_2_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast din vægt i kilogram.");
        int brugerVægt = input.nextInt(); // modtager input om vægt

        System.out.println("Indtast din højde i meter.");
        double brugerHøjde = input.nextDouble(); // modtager input om højde

        double brugerBMI = (brugerVægt / (brugerHøjde * brugerHøjde));

        System.out.print("Din BMI er " + brugerBMI); // printer resultat


    }
}
