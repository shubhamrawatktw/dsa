import java.util.Scanner;

  public class take2Darray {

    public static void print2d(int[][] arr) {
        int rows =arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


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
    
    public static void main(String[] args) {
      
int[][] input =takeInput2d();
print2d(input);
 

    }
}
