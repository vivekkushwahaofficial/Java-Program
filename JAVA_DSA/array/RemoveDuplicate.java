public class RemoveDuplicate {
  public static int removeDuplicate(int[] arr){
    int result = 1;
    int i = 0;
    int n = arr.length-1;

    while(i<n){
      if(arr[i] == arr[i+1]){
        i++;
        continue;
      }
      i++;
      result++;
    }
    return result;
  }

  public static int removeDuplicate1(int[] arr){
    int i = 0;
    int[] nums = new int[arr.length];
    for(int j = 0; j<=arr.length-1; j++){
      continue;
    }
    nums = arr[j];
    return nums;
  }
  public static void main(String[] args) {
      // int [] arr = {1, 1 , 2, 2, 3, 4};
       int [] arr = {1, 1 , 2};
      System.out.println(removeDuplicate(arr));
  }
}
