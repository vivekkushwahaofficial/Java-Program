
import java.util.Arrays;


class segregate {

    static void segregate0and1(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 0) {
              i++;
            } else if (arr[j] == 1) {
                j--;
            } else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
        return;
    }

    void segregate0and11(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 0) {
              i++;
            } else if (arr[j] == 1) {
                j--;
            } else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
        return;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 0};
        // segregate0and1(arr);
        // System.out.println(Arrays.toString(arr));

       segregate obj = new segregate();
       obj.segregate0and11(arr);
       System.out.println(Arrays.toString(arr));
    }
}
