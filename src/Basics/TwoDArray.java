package Basics;

public class TwoDArray {
    public static void main(String[] args) {
        /*initialisation and declaration of 2D array.
        ******************************
        int[][] arr={{1,2,3},{4,5,6}};
        int arr1[][];
        int[][] arr2;
        int[][] arr3=new int [2][3];
        */
        int[][] arr={{1,2,3},{2,3,4}};
        int rowSum=0;
        int columnSum=0;

        //sum of rows of the array
        for(int i=0 ;i <2;i++){
            for(int j=0 ; j<3 ;j++){
                rowSum=rowSum+arr[i][j];
            }
            System.out.println("sum of "+i+"th row is "+ rowSum);
            rowSum=0;
        }

        //sum of columns of the array
        for(int i=0 ;i <3;i++){
            for(int j=0 ; j<2 ;j++){
                columnSum=columnSum+arr[j][i];
            }
            System.out.println("sum of "+i+"th Column is "+ columnSum);
            columnSum=0;
        }

    }
}
