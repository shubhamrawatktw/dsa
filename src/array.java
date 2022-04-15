import java.util.Scanner;

public class array {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
       int size =  s.nextInt();
       int input[] = new int[size];
       for (int i = 0; i <size; i++) {
          input[i]=s.nextInt();
       }
       return input;
    }

    public static void print(int input[]) {
        int size = input.length;
        for (int i = 0; i < size; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static int largestNum(int input[]) {
        int size =input.length;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (input[i]>maxValue) {
                maxValue = input[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int array[]=takeInput();
        // print(array);
       int val = largestNum(array);
       System.out.println("largest number in array is "+val);
    }
}
