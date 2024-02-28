import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Calculations calc = new Calculations();
        System.out.println("Введите число х:");
        double x =scanner.nextDouble();

        Calculations calc1 = new Calculations();
        System.out.println("Введите число a:");
        int a=scanner.nextInt();

        Calculations calc2 = new Calculations();
        System.out.println("Введите число b:");
        int b=scanner.nextInt();


        double result1 = calc.xx(x);
        System.out.println("y = 3x + 5, y = " + result1);

        double result2 = calc1.ab(a, b);
        System.out.println("y = (a + b) / (a - b), y = " + result2);

        int result3 = calc2.fact(a, x, b);
        System.out.println("y = (ax / b)!, y = " + result3);
    }
}
class Calculations {
    public double xx(double x) {
        double result = 3 * x + 5;
         return result;
    }
    public double ab(double a, double b) {
        if (b == a) {
            System.out.println("На 0 делить нельзя");
            return 0;
        } else {
            double result= (a + b) / (a - b);
            return result;
        }
    }
    public int fact(double a, double b, double x) {
        if (b == 0) {
            System.out.println("На 0 делить нельзя");
            return 0;
        } else {
            int result = 1;
            for (int i = 1; i <= (a*x)/b; i++) {
                result *= i;

            }
            return result;
        }

    }
    }









