// import java.util.*;
// public class Array {
//     public static void update(int marks[]) {
//         for(int i=0; i<marks.length; i++) {
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String[] args) {
//         int marks[] = {97, 98, 99};
//         update(marks);

//         for(int i=0; i<marks.length; i++) {
//             System.out.print(marks[i]+" ");
//         }
//         System.out.println();
//     }
// }

// Linear Search
// import java.util.*;
// public class Array {
//     public static int linearSearch(int numbers[], int key) {
//         for(int i=0; i<numbers.length; i++) {
//             if(numbers[i] == key) { 
//                 return i;
//             }
//         }
//             return -1;
//         }
//         public static void main(String args[]) {
//             int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//             int key = 14;

//             int index = linearSearch(numbers, key);
//             if(index == -1) {
//                 System.out.println("NOT found");
//             } else {
//                 System.out.println("key is at index : "+ index);
//         }
//     }
// }

// FINDING THE LARGEST ELEMENTS IN AN ARRAY
// import java.util.*;
// public class Array {
//     public static int getLargest(int numbers[]) {
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<numbers.length; i++) {
//             if(largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {1, 2, 6, 3, 5};
//         System.out.println("Largest value is : " + getLargest(numbers));
//     }
// }

// FINDING THE SMALLEST ELEMENTS IN AN ARRAY
// import java.util.*;
// public class Array {
//     public static int getSmallest(int numbers[]) {
//         int smallest = Integer.MAX_VALUE;
//         for(int i=1; i<numbers.length; i++) {
//                 if (smallest > numbers[i]) {
//                 smallest = numbers[i];
//             }
//         }
//         return smallest;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {1, 2, 6, 3, 5};
//         System.out.println("Smallest value is : " + getSmallest(numbers));
//     }
// }

/* 
import java.util.*;
public class Array {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end)/2;

            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 6;
        System.out.println("index for key is : " + binarySearch(numbers, key));
    }
}
    */

// REVERSE AN ARRAY
// import java.util.*;
// public class Array {
//     public static void reverse(int numbers[]) {
//         int first = 0, last = numbers.length-1;

//         while(first < last) {
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;
//         }
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         reverse(numbers);
//         for(int i=0; i<numbers.length; i++) {
//             System.out.print(numbers[i]+" ");
//         }
//         System.out.println();
//     }
// }

// PAIRS IN AN ARRAY
// import java.util.*;
// public class Array {
//     public static void printParis(int numbers[]) {
//         for(int i=0; i<numbers.length; i++) {
//             int curr = numbers[i];
//             for(int j=i+1; j<numbers.length; j++) {
//                 System.out.print("(" + curr + "," + numbers[j] + ")");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         printParis(numbers);
//     }
// }

// PRINT SUBARRAY
// import java.util.*;
// public class Array {
//     public static void printSubarrays(int numbers[]) {
//         int ts = 0;
//         for(int i=0; i<numbers.length; i++) {
//             int start = i;
//             for(int j=1; j<numbers.length; j++) {
//                 int end = j;
//                 for(int k=start; k<=end; k++) {
//                     System.out.print(numbers[k]+" ");
//                 }
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("total subarrays = " + ts);
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         printSubarrays(numbers);
//     }
// }

// MAX SUBARRAY SUM
// import java.util.*;
// public class Array {
//     public static void maxSubarraySum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         for(int i=0; i<numbers.length; i++) {
//             int start = i;
//             for(int j=0; j<numbers.length; j++) {
//                 int end = j;
//                 currSum = 0;
//                 for(int k=start; k<=end; k++) {
//                     currSum +=numbers[k];
//                 }
//                 System.out.println(currSum);
//                     if(currSum > maxSum) {
//                     maxSum = currSum;
//                     }
//                 }
//             }
//         System.out.println("max sum = " + maxSum);
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8,10};
//         maxSubarraySum(numbers);
//     }
// }

// MAX SUBARRAY SUM USING PREFIX
// import java.util.*;
// public class Array {
//     public static void maxSubarraySum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];

//         prefix[0] = numbers[0];
//         for(int i=1; i<prefix.length; i++) {
//             prefix[i] = prefix[i-1] + numbers[i];
//         }
//         for(int i=0; i<numbers.length; i++) {
//             int start = i;
//             for(int j=1; j<numbers.length; j++) {
//                 int end = j;
//                 currSum = start == 0 ? prefix[end] :prefix[end] - prefix[start-1];
//                 if(maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("max sum = " + maxSum);
//     }
//     public static void main(String args[]) {
//         int numbers[] = {1, -2, 6, -1, 3};
//         maxSubarraySum(numbers);
//     }
// }


