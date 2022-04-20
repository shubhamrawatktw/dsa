import java.util.Scanner;

   public class sum2darray {
    public static int[][] takeInput2d() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter numbers of rows");
        int rows = s.nextInt();
        System.out.println("enter numbers of column");
         int cols = s.nextInt();
         int [][] arr = new int[rows][cols];
     for (int i = 0; i < rows; i++) {
     for (int j = 0; j < cols; j++) {
         System.out.println("enter the element of row "+ i + " and column "+ j + " ");
         arr[i][j]=s.nextInt();
     }
     System.out.println();
      }
         return arr;
    }

public static void sum(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
        int sum =0;
        for (int j = 0; j < arr[i].length; j++) {
            sum+=arr[i][j];
        }
        System.out.print(sum + " ");
    }
}
    public static void main(String[] args) {
        int [][] arr =takeInput2d();
        sum(arr);
    }
}
