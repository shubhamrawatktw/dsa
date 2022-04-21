public class sumBoundaryanddiagonal {

    public static int sum(int[][]arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][]arr = {{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
        int output =sum(arr);
        System.out.println("the sum is " + output);
    }
}
