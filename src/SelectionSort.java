public class SelectionSort {

    public static void selectionSort(int [] input) {
        for (int i = 0; i < input.length-1; i++) {
            int minV = input[i];
            int minIndex = i;
          for (int j = i+1; j < input.length; j++) {
        if (minV>input[j]) {
            minV = input[j];
            minIndex = j;
        }
    }
    input[minIndex] = input[i];
    input[i] = minV;
     
        
        }
    }
    public static void main(String[] args) {
        int[] input = {2,5,6,1,3,4};
      selectionSort(input);
      for (int i = 0; i < input.length; i++) {
          System.out.println(input[i] + " ");
      }
    }
}
