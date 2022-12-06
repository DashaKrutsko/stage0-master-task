package com.epam.algorithms;


/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {

        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                result = i;
                break;
            }
        }

        return result;

    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        int length = arr.length;
        String[] newArr = new String[length];

        for (int i = 0; i < length; i++) {
            newArr[length - 1 - i] = arr[i];
        }
        return newArr;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int j = 0;
        for (int k : arr) {
            if (k > 0) {
                j++;
            }
        }

        int[] arr2 = new int[j];
        int x = 0;
        for (int k : arr) {
            if (k > 0) {
                arr2[x] = k;
                x++;
            }
        }
        return arr2;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */


    public static int[][] sortRaggedArray(int[][] arr) {
        int[][] newArr = new int[arr.length][];
        int temp;
        int[] temp2;
        for (int i = arr.length - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                if (arr[j + 1].length < arr[j].length) {
                    temp2 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp2;
                }
            }

            for (int z = 0; z < arr[i].length; z++) {
                for (int y = 0; y < arr[i].length - z - 1; y++) {
                    if (arr[i][y + 1] < arr[i][y]) {
                        temp = arr[i][y + 1];
                        arr[i][y + 1] = arr[i][y];
                        arr[i][y] = temp;
                    }
                }
            }
        }

        return arr;
    }



}
