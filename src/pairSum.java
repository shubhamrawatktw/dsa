import java.util.Scanner;

public class pairSum {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
       int size =  s.nextInt();
       int input[] = new int[size];
       for (int i = 0; i <size; i++) {
          input[i]=s.nextInt();
       }
       return input;
    }

    public static int pair(int[] input,int num) {
        int count =0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if (input[i] + input[j]==num) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int array[] = takeInput();
        System.out.println("give pair sum number");
        int num = s.nextInt();
       int output = pair(array, num);
       System.out.println(output);

    }
}
