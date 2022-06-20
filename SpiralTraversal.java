public class SpiralTraversal {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralTraversal(matrix);
    }
    //Spiral Traversal of Matrix using 4 pointers
    static void spiralTraversal(int[][] matrix){
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int down = matrix.length-1;
        while(top<=down && left<=right){                // --------> traversing left to right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i]+" ");

            }
            top++;
            for(int i=top; i<=down ;i++){               // traversing top to down
                System.out.print(matrix[i][right]+" ");

            }
            right--;
            for(int i=right;i>=left;i--){                //    <------ traversing right to left
                System.out.print(matrix[down][i]+" ");

            }
            down--;
            for(int i=down;i>=top;i--){                   // traversing down to top
                System.out.print(matrix[i][left]+" ");

            }
            left++;

        }
    }
}
