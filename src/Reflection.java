// Task 9
public class Reflection {
    public static void main(String[] args) {
        String str = "KI-35 Forever";
        char[] revStr = str.toCharArray();
        int length = str.length();
        System.out.println("Reverse string: ");
        reverse(str.length() - 1,revStr);
    }

    private static void reverse(int i,char revStr[]){
        if(i == -1) return;
        System.out.print(revStr[i]);
        reverse(i-1,revStr);
    }
}
