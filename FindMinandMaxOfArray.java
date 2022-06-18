public class FindMinandMaxOfArray {
    public static void main(String[] args) {
        int array[] = {3,9,435,6,26,5725,7,2,62,1,-77,4,1,0};
        minMax(array);
    }
    static void minMax(int[] array){
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.print("Minimum:"+min +"  Maximum:"+max);
    }
}
