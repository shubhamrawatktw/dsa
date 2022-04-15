import java.util.Scanner; // import the Scanner class 


public class primenumber {
    public static boolean isPrime(int n) {
        int d = 2;
        while (d<n) {
            if (n%d==0) {
                return false;
            }
            d++;
        }
        return true;
        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your number");
        int num = s.nextInt();

           boolean ansPrime = isPrime(num);
           System.out.println("this number is prime :"+ansPrime);

    }
}

    
    
