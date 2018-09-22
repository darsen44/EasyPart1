
// Task 1
// maybe I don't understand task correctly
import java.util.Scanner;

public class Dot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spaceCount = 0;
        while (true){
            String str = scanner.nextLine();
            if(str.contains(".")) break;
            for(char ch : str.trim().toCharArray()){ // find space between words
                if(ch == ' ' ){
                    spaceCount++;
                }
            }
        }
        System.out.println(spaceCount);
    }
}

