import java.util.Scanner;

public class arrangeArray {
    public static int takeInput() {
        Scanner s = new Scanner(System.in);
        int value = s.nextInt();
        return value;
    }

    public static void arrange(int n) {
        if (n%2==1) {
            for (int i = 1; i <=n; i=i+2) {
                System.out.print(i + " ");
           }
           for (int j = n-1; j >0 ; j=j-2) {
               System.out.print(j + " ");
           }
        }

        if (n%2==0) {
            for (int i = 1; i <=n; i=i+2) {
                System.out.print(i + " ");
           }
           for (int j = n; j >0 ; j=j-2) {
            System.out.print(j + " ");
        }


        }
       
        return;
    }
    public static void main(String[] args) {
        System.out.println("give your input");
        int value = takeInput();

        arrange(value);
    }
}
