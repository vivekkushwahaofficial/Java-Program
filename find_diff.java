public class find_diff {
  public static int finddifference(int[] arr){
    int min = arr[0];
    int max = arr[0];

    for (int i = 0; i < arr.length; i++) {
        if(arr[i] < min){
          min = arr[i];
        }
        if(arr[i] > max){
          max = arr[i];
        }
    }
    return max - min;
  }
  public static void main(String[] args) {
      int arr[] = {2, 54, 6, 7, 8};
      int result = finddifference(arr);
      System.out.println(result);
  }
}