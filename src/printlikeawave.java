public class printlikeawave {
    public static void wave(int [][]arr,int rows) {
      int n= 0;
      int j=0;
      while (n<=rows) {
          
          if (n%2==0) {
              for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i][j] + " ");
                }
                n++;
                j++;
            }
            if (n%2!=0) {
                for (int k = arr.length-1; k >=0; k--) {
                    System.out.print(arr[k][j] + " ");
                }
                n++;
                j++;
            }
        }
       
    }
    public static void main(String[] args) {
        int[][]arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        wave(arr,3);
    }
}
