import java.util.Scanner;

// Task 3
public class IncreaseArray {
    public static void main(String[] args) {
        double arr[] = new double[]{1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select index of array element: ");
        int i = scanner.nextInt();
        increase(arr,i);
        arr[i] = Math.round(arr[i]*100.0)/100.0;// to round result
        System.out.println("Increased element: "+arr[i]);
    }
    private static void increase(double arr[], int i){
        arr[i]*= 1.1;
    }
}
