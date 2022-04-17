
public class binarySearch {

public static int binary_search(int [] input ,int num) {
int start = 0;
int end = input.length-1;

while (start<=end) {
    int mid = (start+end)/2;
    
    if (input[mid]>num) {
        end = mid-1;
    }
    else if (input[mid] < num) {
        start = mid+1;
    }
      else {
          return mid;
      }
}
  return -1;
}
  
  public static void main(String[] args) {
      int [] arr ={2,4,6,8,10,12,14};
     int index = binary_search(arr, 14);
      System.out.println(index);
  }

    
}
