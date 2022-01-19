import java.util.Scanner;
public class KECalculator {
    private static Scanner input;
    public static double KineticEnergy(double x, double y){
        double KE;
        KE = 0.5*x*y*y;
        return KE;
    }
    public static void main(String[]args){
        input = new Scanner(System.in);
        System.out.print("Enter mass in Kilograms: ");
        double mass = input.nextDouble();
        System.out.print("Enter Velocity in meters per second: ");
        double vel = input.nextDouble();
        double KEsolver = KineticEnergy(mass, vel);
        System.out.println("The object's Kinetic Energy is: "+String.format("%.2f", KEsolver)+" J.");
    }
}
