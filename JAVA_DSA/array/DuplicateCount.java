
public class DuplicateCount {

    public static int countUniqueNum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int index = 0;
        int lastIndex = arr.length - 1;
        int count = 1;

        while (index < lastIndex) {
            //   if(arr[index] == arr[index + 1]){
            //     index++;
            //     continue;
            //   }
            //   index++;
            //   count++;

            if (arr[index] != arr[index + 1]) {
                count++;
            }
            index++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5};
        System.out.println(countUniqueNum(arr));
    }
}
