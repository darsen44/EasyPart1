
//Task 8
public class Average {
    public static void main(String[] args) {
        double arr[] = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = 0;
        for (int i = 0; i < arr.length; i++ ){
            sum += arr[i];
        }
        System.out.println("Average of array: " + sum/arr.length);
    }
}
