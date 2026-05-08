package Developer;
import java.util.Scanner;
public class Day_02 {
    static void main() {
        double OnePounds = 0.45359237d;
        Scanner sc = new Scanner(System.in);
        double KiloGrams;
        System.out.println("Enter the Number of Pounds to convert into KiloGrams!");
        double NumPounds = sc.nextFloat();
        double PoundToKiloGram = NumPounds * OnePounds ;
        System.out.println("Number Of KiloGrams in "+NumPounds+"Pounds is "+PoundToKiloGram+" KiloGrams");
    }
}
