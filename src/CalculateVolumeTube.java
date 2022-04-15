import java.util.Scanner;

public class CalculateVolumeTube {
    public static void main(String args[]) {
        // define variables
        double phi = 3.14;

        // define scanner
        Scanner finger_input = new Scanner(System.in);
        Scanner high_input = new Scanner(System.in);
        
        // show input finger
        System.out.print("Masukkan jari-jari tabung (dalam cm) : ");
        int finger = finger_input.nextInt();

        // show input high
        System.out.print("Masukkan tinggi tabung (dalam cm) : ");
        int high = high_input.nextInt();
 
        // execute
        double volume = phi * finger * finger * high;

        // show result
        System.out.println("Volume tabung adalah " + volume + "cm");
    }
}
