// Task 7
public class SimpleNumbers {
    public static void main(String[] args) {
        System.out.println("Simple Numbers: ");
        for (int i = 2;i <= 100; i++){
            if (i<8 && i%2!=0 || i == 2)  System.out.println(i);
            else if(i%2 != 0 &&  i%3 != 0 && i%5 !=0 && i%7 != 0){
               System.out.println(i);
            }
        }
    }
}
