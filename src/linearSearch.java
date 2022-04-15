import java.util.Scanner;

public class linearSearch {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
       int size =  s.nextInt();
       int input[] = new int[size];
       for (int i = 0; i <size; i++) {
          input[i]=s.nextInt();
       }
       return input;
    }

    public static int search(int input[], int val) {
        int size = input.length;
        int notFound = -1;
       
      
      for (int i = 0; i < size; i++) {
          if (val==input[i]) {
              return i;
          }
        }
        return notFound;
         
    }
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val =s.nextInt();
        System.out.println("find this number" + val);
        int arr[]= takeInput();

        int number =search(arr, val);
     
        System.out.println("here is the number" + number);

   
          

      
    }
}
