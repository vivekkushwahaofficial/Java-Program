package array;

import java.util.Arrays;

public class twoSum {
  public static int[] twoSum1(int[] arr){
      int[] arr1 = new int[2];
       int target = 9;
    int n = arr.length;
    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
        if(arr[i]+ arr[j] == target){
          arr1[0] =  arr[i];
          arr1[1] =  arr[j];
          return arr1;
          
        }
      }
    }
    return arr1;
  }


  public static int[] twoSum2(int[] arr,int target){
    int[] arr2 = new int[2];
    for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<arr.length; j++){
        if(arr[i] + arr[j] == target){
          arr2[0] = i;
          arr2[1] = j;
          return arr2;
        }
      }
    }
    return arr2;
  }
  public static void main(String[] args){
    int target = 9;
    // int arr1 = new int[2];
    int[] arr = {2, 4, 6, 7, 4};
    int[] result = twoSum1(arr);
    System.out.println(Arrays.toString(result));
    System.out.println(result[0] + result[1]);
    int[] result1 = twoSum2(arr, target);
    System.out.println(Arrays.toString(result1));
    System.out.println("idx"+"["+ result[0]+"]" +"," + "idx"+"["+ result[1]+"]");
    System.out.println("idx["+ result[0]+"], " + "idx["+ result[1]+"]");
  }
}