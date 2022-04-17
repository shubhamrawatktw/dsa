import java.util.Arrays;

public class InsertionSort {
    
    public static void insertionSort(int [] input) {
      for (int i = 0; i < input.length; i++) {
          int temp = input[i];
          int j= i-1;
          while (j>=0 && input[j] > temp) {
              input[j+1] = input[j];
              j--;
          }
          input[j+1] = temp;
       

      }
    }

    public static void main(String[] args) {
        int[] input = {9,8,5,6,2,1};
        insertionSort(input);
      System.out.print(Arrays.toString(input));
    }
}
