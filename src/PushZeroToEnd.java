import java.util.Arrays;

public class PushZeroToEnd {

    public static int[] pushZeroToEnd(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==0 && arr[j]>0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {9,0,0,8,2};
      int[]output =  pushZeroToEnd(arr);
      for (int i = 0; i < output.length; i++) {
          System.out.print(output[i] + " ");
      }

    }
    
}
