public class kadaneAlgorithm {
    public static void main(String[] args) {
        int arr[] = {1,2,3,-2,5};    // Kadane's algorithm to find maximum sub-array sum
        int sum = 0;
        int max = arr[0];            // sum-stores current sum , if (sum<0) then sum =0
        for(int i=0;i<arr.length;i++){
            sum += arr[i];            // max returns the maximum value of sum.
            if(sum> max){
                max = sum;
            }
            if(sum<0){
                sum =0;
            }
        }
        System.out.print(max);
    }
}
