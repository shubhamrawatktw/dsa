import java.util.Scanner;

public class arrayIntersection {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
       int size =  s.nextInt();
       int input[] = new int[size];
       for (int i = 0; i <size; i++) {
          input[i]=s.nextInt();
       }
       return input;
    }

public static int intersection(int[] arg1,int[] arg2) {
int sizeA= arg1.length;
int sizeB = arg2.length;

for (int i = 0; i < sizeA; i++) {
    for (int j = 0; j < sizeB; j++) {
        if (arg1[i] == arg2[j]) {
            arg2[j] = Integer.MIN_VALUE;
            System.out.println("intersection "+  arg1[i]);
            // return arg1[i];
            break;
        }
    }
}


    return Integer.MAX_VALUE;
}
    public static void main(String[] args) {
        int [] a= takeInput();
        int [] b = takeInput();
      int output=  intersection(a, b);   
    }
}
