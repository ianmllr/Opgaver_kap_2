import java.util.Scanner; // importerer scanner

public class Opg_2_2 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in); // initialiserer scanneren?

    System.out.print("Indtast dit navn: ");
    String name = input.nextLine();

    System.out.print("Indtast din alder: ");
    int alder = input.nextInt();

    System.out.print("Indtast dit yndlingsdemical: ");
    double yndlingsTal = input.nextDouble();

    System.out.println("Hej, dit navn er " + name + ", du er " + alder + " år gammel, og dit yndlingsdecimal er " + yndlingsTal); // printer resultatet

    }
}
