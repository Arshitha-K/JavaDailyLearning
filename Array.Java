public class Array{
    public static void main(String[]args){
        int nums[][]=new int [3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j] +(int)( Math.random()*10)+ " ");

            }
            System.out.println();

        }
  }
}
/*
 * This code initializes a 2D array of integers with 3 rows and 4 columns.
 * It fills the array with random integers between 0 and 9 and prints the values using type casting as Math.random gives a double value.
 * The outer loop iterates through the rows, while the inner loop iterates through the columns
 */