import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

  // Return the Value
    public static int[] twoSumValues(int[] arr, int target) {
        
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                   return new int[]{arr[i], arr[j]};

                }
            }
        }
        return new int[]{-1, -1};
    }
//   Return the Indices
    public static int[] twoSumIndicesBruteForce(int[] arr, int target) {
        int[] arr2 = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    arr2[0] = i;
                    arr2[1] = j;
                    return arr2;
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSumIndicesHashMap(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int need = target - current;

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(current, i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int target = 9;
        // int arr1 = new int[2];
        int[] arr = {2, 4, 6, 7, 4};
        int[] result1 = twoSumValues(arr, target);
        System.out.println(Arrays.toString(result1));
        System.out.println(result1[0] + result1[1]);
        int[] result2 = twoSumIndicesBruteForce(arr, target);
        System.out.println(Arrays.toString(result2));
        // System.out.println("idx" + "[" + result[0] + "]" + "," + "idx" + "[" + result[1] + "]");
        // System.out.println("idx[" + result[0] + "], " + "idx[" + result[1] + "]");
          int[] result3 = twoSumIndicesHashMap(arr, target);
        System.out.println(Arrays.toString(result3));
    }
}
