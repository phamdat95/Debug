import java.util.Scanner;

public class condition {
    public static void main(String[] args){
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        a = scanner.nextDouble();
        System.out.println("Enter b:");
        b = scanner.nextDouble();
        System.out.println("Enter c:");
        c = scanner.nextDouble();

        if (a!=0){
            double x = (c - b)/a;
            System.out.printf("Equation pass with x= %f!\n", x);
        } else if (b == 0)
            System.out.println("The solution is all x!");
        else System.out.println("No solution");
    }
}
