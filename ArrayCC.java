import java.util.*;
public class ArrayCC {
    // public static void update(int marks[]) {
    //     for(int i=0; i<marks.length; i++) {
    //         marks[i] = marks[i] + 1;
    //     }
    // }
    // public static void main(String args[]) {
    //     int marks[] = {97, 98, 99};
    //     update(marks);
    //     for(int i=0; i<marks.length; i++) {
    //         System.out.print(marks[i]+" ");
    //     }
    //     System.out.println();
    // }
// }

// import java.util.*;
// public class ArrayCC {
//     public static int linearSearch(int numbers[], int key) {

//         for (int i=0; i<numbers.length; i++) {
//             if(numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 10;
         
//         int index = linearSearch(numbers, key);
//         if(index == -1) {
//             System.out.println("Key not found.");
//         } else {
//        System.out.println("key is at index : " + index);
//        } 
//     }
// }
public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    int i=0, j=arr.length-1;
    while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    System.out.println(Arrays.toString(arr));
}
    
}
