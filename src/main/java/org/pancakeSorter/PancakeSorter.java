package org.pancakeSorter;

public class PancakeSorter {
    // Reverse the array
    public void flipArray(int arr[], int j) {
        int temp, begin = 0;
        while (begin < j) {
            temp = arr[begin];
            arr[begin] = arr[j];
            arr[j] = temp;
            begin = begin + 1;
            j = j - 1;
        }
    }

    // Return the element with max index
    public int findMax(int arr[], int s) {
        int idx, j;
        for (idx = 0, j = 0; j < s; ++j) {
            if (arr[j] > arr[idx]) {
                idx = j;
            }
        }
        return idx;
    }

    // Sort the array using flipArray() and findMax()
    public int[] sort(int[] arr, int s) {
        for (int currSize = s; currSize > 1; --currSize) {
            int idx = findMax(arr, currSize);
            if (idx != currSize - 1) {
                // move the max to the beginning
                flipArray(arr, idx);
                // reverse the array
                flipArray(arr, currSize -1);
            }
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}