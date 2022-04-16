import java.util.Scanner;
public class findUnique {

       public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
       int size =  s.nextInt();
       int input[] = new int[size];
       for (int i = 0; i <size; i++) {
          input[i]=s.nextInt();
       }
       return input;
    }

    public static int unique(int[] input) {
        int size = input.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i!=j) {
                    if (input[i]==input[j]) {
                        break;
                    }
                }
                if (j==size) {
                   
                    return input[i];

                }
            }
        }

        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        int output = unique(arr);
        System.out.println(output);
    }
}
