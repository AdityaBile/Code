
// import java.util.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _14sorting {
    // // Bubble sort
    // public static void bubbleSort(int arr[]) {
    // for (int turn = 0; turn < arr.length - 1; turn++) {
    // for (int j = 0; j < arr.length - 1 - turn; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }
    // }

    // public static void printArr(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // }

    // public static void main(String args[]) {
    // int arr[] = { 5, 4, 1, 3, 2 };
    // System.out.print("Unsorted array is : ");
    // printArr(arr);
    // bubbleSort(arr);
    // System.out.print("Sorted array is : ");
    // printArr(arr);
    // }

    // // Selection Sort
    // public static void selectionSort(int arr[]) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // int minNo = i;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[minNo] > arr[j]) {
    // minNo = j;
    // }
    // }
    // int temp = arr[minNo];
    // arr[minNo] = arr[i];
    // arr[i] = temp;

    // }
    // }

    // public static void printArray(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    // public static void main(String args[]) {
    // int arr[] = { 5, 4, 1, 3, 2 };
    // selectionSort(arr);
    // printArray(arr);
    // }

    // public static void printArray(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // }

    // public static void main(String args[]) {
    // int arr[] = { 3, 2, 5, 1, 4 };
    // Arrays.sort(arr);
    // printArray(arr);
    // Arrays.sort(arr, 0, 3);
    // printArray(arr);
    // }

    // public static void bubbleSort(int numbers[]) {
    // for (int turn = 0; turn < numbers.length - 1; turn++) {
    // for (int j = 0; j < numbers.length - 1 - turn; j++) {
    // if (numbers[j] > numbers[j + 1]) {
    // int temp = numbers[j];
    // numbers[j] = numbers[j + 1];
    // numbers[j + 1] = temp;
    // }
    // }
    // }
    // }

    // public static void sortArray(int arr[]) {
    // int swap = 0;
    // for (int i = 0; i < arr.length - 1; i++) {
    // if (arr[i + 1] < arr[i]) {
    // swap++;
    // }
    // }
    // System.out.println("If swap=0 array is sorted else not : " + swap);
    // }

    // public static void printArray(int numbers[]) {
    // for (int i = 0; i < numbers.length; i++) {
    // System.out.print(numbers[i] + " ");
    // }
    // System.out.println();
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 5, 4, 1, 3, 2 };
    // bubbleSort(numbers);
    // printArray(numbers);
    // int arr[] = { 1, 2, 3, 4, 5 };
    // sortArray(arr);
    // }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minCnt = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minCnt] > arr[j]) {
                    minCnt = j;
                }
            }
            int temp = arr[minCnt];
            arr[minCnt] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selectionSort(arr);
        printArray(arr);

    }

    // public static void insertionSort(int arr[]) {
    // for (int i = 1; i < arr.length; i++) {
    // int curr = arr[i];
    // int prev = i - 1;
    // while (prev >= 0 && arr[prev] > curr) {
    // arr[prev + 1] = arr[prev];
    // prev--;
    // }
    // arr[prev + 1] = curr;
    // }
    // }

    // public static void printArray(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    // public static void printArray(Integer arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // }

    // public static void main(String[] args) {
    // Integer arr[] = { 5, 4, 1, 3, 2 };
    // Arrays.sort(arr);
    // printArray(arr);
    // Arrays.sort(arr, Collections.reverseOrder());
    // printArray(arr);
    // }

    // public static void main(String[] args) {
    // int arr[] = { 5, 4, 1, 3, 2 };
    // insertionSort(arr);
    // printArray(arr);

    // }

}
