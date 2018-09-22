import java.util.Scanner;

// Task 6
public class Game {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIKLMNOPQRSTVXY";
        String character = "L";
        choose(character,alphabet);
    }

    private static void choose(String character, String alphabet){
        while (true) {
            System.out.println("Enter char: ");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next().trim();
            choose = choose.toUpperCase();
            character = character.trim();
            if (choose.equals(character)) {
                System.out.println("You win");
                return;
            }
            if (alphabet.indexOf(choose) > alphabet.indexOf(character)) {
                System.out.println("You’re too low");
            } else System.out.println("You’re too high");
        }
    }
}
