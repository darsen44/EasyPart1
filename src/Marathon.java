
// Task 10
public class Marathon {
    public static void main(String[] args) {
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
         int max = times[0];
         int i = 0;
         int maxi = 0;
        for (; i <times.length ; i++) {
            if(max < times[i]) {
                maxi = i;
                max = times[i];
            }
        }
        System.out.println("Winner: " + names[maxi]);
    }
}

