import java.util.Scanner;
public class Opg_2_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast en radius.");
        int dinRadius = input.nextInt(); // modtager brugerens input

        double areal = Math.PI  * (dinRadius * dinRadius);
        double omkreds = 2 * Math.PI * dinRadius;

        System.out.print("Arealet er " + areal + " og omkredsen er " + omkreds);


    }
}