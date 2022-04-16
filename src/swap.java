
import java.util.Arrays;
import java.util.Scanner;

public class swap {
   
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
       int size =  s.nextInt();
       int input[] = new int[size];
       for (int i = 0; i <size; i++) {
          input[i]=s.nextInt();
       }
       return input;
    }

    public static void swapAlternate(int input[]) {
        int size = input.length;
        for (int i = 0; i < size-1; i=i+2) {
            int temp = input[i];
            input[i] = input[i+1];
            input[i+1] = temp;
        }
        
    }
    public static void main(String[] args) {
      int arr[]=takeInput();
       swapAlternate(arr);
      String output=Arrays.toString(arr);
       System.out.println(output);
    }
       
}
