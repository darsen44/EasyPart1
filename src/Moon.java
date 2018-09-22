import java.util.Scanner;
// Task 2

public class Moon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();
        double moonWeight = weight * 0.17;
        System.out.print("Your weight on Moon: " + moonWeight);
    }
}
