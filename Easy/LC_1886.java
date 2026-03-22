// Created a function for rotating a 2D array by 90°
// Transposed the matrix and then reversed all the rows of the matrix for the rotation
// Rotated the matrix 4 times and checked if even once the rotated matrix matched the target one

class Solution {
    public static void rotateMatrix(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int si = 0, ei = n - 1;

            while (si < ei) {
                int temp = arr[i][si];
                arr[i][si] = arr[i][ei];
                arr[i][ei] = temp;

                si++;
                ei--;
            }
        }
    }

    public boolean findRotation(int[][] mat, int[][] target) {

        boolean isTrue = false;

        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                isTrue = true;
                break;
            } else {
                rotateMatrix(mat);
            }
        }

        return isTrue;
    }
}