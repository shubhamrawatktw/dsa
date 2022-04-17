public class BubbleSort {
public static void bubbleSort(int[] input) {
    for (int i = 0; i < input.length-1; i++) {
        for (int j = i+1; j < input.length; j++) {
            // if (input[i]<=input[j]) {
            //     break;
            // }

            if (input[i]>input[j]) {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
    }

}
    public static void main(String[] args) {
        int[] input = {2,13,4,1,3,6,28};
        bubbleSort(input);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i] + " ");
        }
    }
}
