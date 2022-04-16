import java.util.Scanner;
public class findDuplicate {
    
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
       int size =  s.nextInt();
       int input[] = new int[size];
       for (int i = 0; i <size; i++) {
          input[i]=s.nextInt();
       }
       return input;
    }


    public static int duplicate(int[] input) {
        
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                
                if (i!=j) {
                    
                    if (input[i]==input[j]) {
                         System.out.println( "the answer is  :" + input[i]);
                         return input[i];
                    }
                }
            }
        }


        return 5;
    }
    public static void main(String[] args) {
      int array[] =  takeInput();
      int output = duplicate(array);
    }
}
