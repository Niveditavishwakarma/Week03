package binarysearch.searchinmatrix;

public class Main {
        public static void main (String[] args){
            int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };
            int target = 5;
            boolean found = SearchInMatrix.searchMatrix(matrix, target);
            System.out.println("Target " + target + " found: " + found);
        }
    }

