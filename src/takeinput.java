import java.util.Scanner;

public class takeinput {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
       int size =  s.nextInt();
       int input[] = new int[size];
       for (int i = 0; i <size; i++) {
          input[i]=s.nextInt();
       }
       return input;
    }

    public static void main(String[] args) {
      int array[] =  takeInput();
    }
}
