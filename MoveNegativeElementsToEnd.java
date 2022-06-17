import java.util.Arrays;

public class MoveNegativeElementsToEnd{
    public static void main(String[] args) {
        // Move negative elements to the start of the array
        int arr[] = {-3,7,-4,4,-5,10,-6,-1,9};
        int j= -1;                          // Two pointers I and J , pivot =0;

        for (int i = 0; i < arr.length; i++) {      // arr[i] < 0 then
            if(arr[i]< 0 ){                         // j++,swap arr[j] and arr[i]
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }

        System.out.print(Arrays.toString(arr));

        }



    }

