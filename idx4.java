
// public class idx4 {

//     public static void main(String[] args) {
//         int[] arr = {4, 3, 8, 7, 5};
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] < arr[j]) {
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.err.println();
//         System.out.println(arr[arr.length - 4]);
//         // System.err.println(arr[4]);
//     }
// }



public class idx4 {

    public static void main(String[] args) {
        int[] arr = {4, 3, 8, 7, 5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.err.println();
        // System.out.println(arr[arr.length - 4]);
    }
}
