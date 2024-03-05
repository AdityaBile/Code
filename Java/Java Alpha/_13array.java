import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthStyleFactory;

public class _13array {

    // // Array Bascis -----------------------------------------------------
    // public static void main(String args[]) {
    // int marks[] = new int[100];
    // Scanner sc = new Scanner(System.in);

    // marks[0] = sc.nextInt();
    // marks[1] = sc.nextInt();
    // marks[2] = sc.nextInt();

    // System.out.println("Marks of phy : " + marks[0]);
    // System.out.println("Marks of chem : " + marks[1]);
    // System.out.println("Marks of math : " + marks[2]);

    // marks[1] = marks[1] + 1;
    // System.out.println("marks of chem : " + marks[1]);

    // System.out.println(marks.length);

    // System.out.println("Average of sub : " + (marks[0] + marks[1] + marks[2]) /
    // 3);

    // }

    // // Array by loop ----------------------------------------------------------
    // public static void main(String args[]) {
    // int marks[] = { 74, 82, 45 };
    // int nonchangeable = 10;
    // update(marks, nonchangeable);

    // for (int i = 0; i < marks.length; i++) {
    // System.out.print(marks[i] + " ");
    // }
    // System.out.println();

    // System.out.println("nonchangeable in main function : " + nonchangeable);

    // }

    // public static void update(int marks[], int nonchangeable) {
    // nonchangeable = 20;
    // for (int i = 0; i < marks.length; i++) {
    // marks[i] = marks[i] + 3;
    // }
    // System.out.println("nonchangeable in function " + nonchangeable);
    // }

    // public static int largeSmallNo(int numbers[]) {
    // int large = Integer.MIN_VALUE;
    // int small = Integer.MAX_VALUE;
    // for (int i = 0; i < numbers.length; i++) {
    // if (numbers[i] > large) {
    // large = numbers[i];
    // }
    // if (numbers[i] < small) {
    // small = numbers[i];
    // }
    // }
    // System.out.println("smallest number is : " + small);
    // return large;
    // }

    // // Check no. is present in array -------------------------------------------
    // public static void main(String args[]) {
    // int num[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the no. to check : ");
    // int key = sc.nextInt();
    // int index = linearSrch(num, key);
    // if (index == -1) {
    // System.out.println("Element is not present in array");

    // } else {
    // System.out.println("Element is present in array at index : " + index);
    // }
    // }

    // public static int linearSrch(int num[], int key) {
    // for (int i = 0; i < num.length; i++) {
    // if (num[i] == key) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // // Largest no. in array -------------------------------------------------
    // public static int largeNum(int number[]) {
    // int largest = Integer.MIN_VALUE;
    // int smallest = Integer.MAX_VALUE;

    // for (int i = 0; i < number.length; i++) {
    // if (number[i] > largest) {
    // largest = number[i];
    // }

    // if (number[i] < smallest) {
    // smallest = number[i];
    // }
    // }
    // System.out.println("Smallest no. in array is : " + smallest);
    // return largest;
    // }

    // public static void main(String args[]) {
    // int number[] = { 1, 2, 6, 3, 5 };
    // System.out.println("Largest number in array is : " + largeNum(number));
    // }

    // // Binary Search -------------------------------------------------
    // public static int binarysrch(int number[], int key) {
    // int start = 0;
    // int end = number.length - 1;
    // while (start <= end) {
    // int mid = (start + end) / 2;

    // if (number[mid] == key) {
    // return mid;
    // }

    // if (number[mid] < key) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }

    // }
    // return -1;

    // }

    // public static void main(String args[]) {
    // int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    // // int key = 18;
    // int index = binarysrch(number, 18);
    // if (index == -1) {
    // System.out.println("Number is not present in array ");
    // } else {
    // System.out.println("The index of key is : " + index);
    // }

    // }

    // // Reverse the array -------------------------------------
    // public static void reverse(int number[]) {
    // int first = 0;
    // int last = number.length - 1;

    // while (first < last) {
    // int temp = number[last];
    // number[last] = number[first];
    // number[first] = temp;

    // first++;
    // last--;

    // }
    // // System.out.println(number);
    // }

    // public static void main(String args[]) {
    // int number[] = { 2, 4, 6, 8, 10 };
    // reverse(number);

    // for (int i = 0; i < number.length; i++) {
    // System.out.print(number[i] + " ");
    // }
    // System.out.println();
    // }

    // // Array Pair
    // public static void arrayPair(int numbers[]) {
    // int count = 0;
    // for (int i = 0; i <= numbers.length - 1; i++) {
    // int curr = numbers[i];
    // for (int j = i + 1; j <= numbers.length - 1; j++) {
    // System.out.print("(" + curr + "," + numbers[j] + ") ");
    // count++;
    // }
    // System.out.println();
    // }
    // System.out.println("Number of pairs :" + count);
    // }

    // public static void main(String args[]) {
    // int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
    // arrayPair(numbers);

    // }

    // SubStrings and sum's min & max value
    // -----------------------------------------
    // public static void subString(int numbers[]) {
    // int totalCount = 0;
    // int sum = 0;
    // int largest = Integer.MIN_VALUE;
    // int smallest = Integer.MAX_VALUE;
    // for (int i = 0; i < numbers.length; i++) {
    // int start = i;
    // for (int j = i; j < numbers.length; j++) {
    // int end = j;
    // for (int k = start; k <= end; k++) {
    // System.out.print(numbers[k] + " ");
    // sum = sum + numbers[k];

    // if (sum < smallest) {
    // smallest = sum;
    // }

    // if (sum > largest) {
    // largest = sum;
    // }
    // }
    // sum = 0;
    // totalCount++;
    // System.out.println();
    // }
    // System.out.println();
    // }
    // System.out.println("total sub strings are : " + totalCount);
    // System.out.println("smallest sum is : " + smallest);
    // System.out.println("largest sum is : " + largest);
    // }

    // public static void main(String args[]) {
    // int numbers[] = { 2, 4, 6, 8, 10 };
    // subString(numbers);

    // }

    // // maxSum of subarray -----------------------------------------------
    // public static void sumSubArray(int numbers[]) {
    // int currSum = 0;
    // int highSum = Integer.MIN_VALUE;

    // int prefix[] = new int[numbers.length];
    // prefix[0] = numbers[0];
    // for (int j = 1; j < prefix.length; j++) {
    // prefix[j] = prefix[j - 1] + numbers[j];
    // }

    // for (int i = 0; i < numbers.length; i++) {
    // int start = i;
    // for (int j = i; j < numbers.length; j++) {
    // int end = j;
    // currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
    // System.out.print(currSum + " ");
    // }
    // if (highSum < currSum) {
    // highSum = currSum;
    // }
    // System.out.println();

    // }
    // System.out.println("Maximum sum of numbers in array is : " + highSum);

    // }

    // public static void main(String[] args) {
    // int numbers[] = { 1, -2, 6, -1, 3 };
    // sumSubArray(numbers);

    // }

    // // Kadanes algorithm -----------------------------------------------------
    // public static void kadanes(int numbers[]) {
    // int currSum = 0;
    // int maxSum = Integer.MIN_VALUE;

    // for (int i = 0; i < numbers.length; i++) {
    // currSum = currSum + numbers[i];
    // if (currSum < 0) {
    // currSum = 0;
    // }
    // maxSum = Math.max(currSum, maxSum);
    // }
    // System.out.println("Max sum of numbers in substring in array is : " +
    // maxSum);
    // }

    // public static void kadaneNeg(int num[]) {
    // int cs = 0;
    // int ms = Integer.MIN_VALUE;

    // for (int i = 0; i < num.length; i++) {
    // cs = cs + num[i];
    // if (cs < 0) {
    // cs = 0;
    // }
    // ms = Math.max(cs, ms);

    // if (ms == 0) {
    // cs = cs + num[i];
    // // ms = Math.max(cs, ms);
    // }
    // }
    // System.out.print(ms);
    // }

    // public static void main(String args[]) {
    // int numbers[] = { -2, -3, 4, -1, -2, 1, 5, 3 };
    // int num[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
    // kadanes(numbers);
    // kadaneNeg(num);
    // }

    // //Trapped Rain water ---------------------------------------------
    // public static int trappedRainWater(int height[], int width) {
    // // left max boundary
    // int left[] = new int[height.length];
    // left[0] = height[0];
    // for (int i = 1; i < height.length; i++) {
    // left[i] = Math.max(height[i], left[i - 1]);
    // }

    // // right max boundary
    // int right[] = new int[height.length];
    // right[height.length - 1] = height[height.length - 1];
    // for (int i = height.length - 2; i >= 0; i--) {
    // right[i] = Math.max(height[i], right[i + 1]);
    // }

    // // loop
    // // water level
    // int trapWater = 0;
    // for (int i = 0; i < height.length; i++) {
    // int waterLevel = Math.min(left[i], right[i]);

    // // trapped water
    // trapWater = trapWater + (waterLevel - height[i]) * width;

    // }

    // return trapWater;
    // }

    // public static void main(String args[]) {
    // int height[] = { 4, 2, 0, 6, 3, 2, 5 };
    // int width = 1;
    // System.out.println("Total Trapped Water is : " + trappedRainWater(height,
    // width));

    // }

    // // MAximum profit in stock
    // ---------------------------------------------------------------
    // public static int stockSellAndBuy(int stockPrice[]) {
    // int buyPrice = Integer.MAX_VALUE;
    // int maxProfit = 0;

    // for (int i = 0; i < stockPrice.length; i++) {
    // if (buyPrice < stockPrice[i]) {
    // int profit = stockPrice[i] - buyPrice;
    // maxProfit = Math.max(profit, maxProfit);

    // } else {
    // buyPrice = stockPrice[i];
    // }
    // }
    // return maxProfit;
    // }

    // public static void main(String args[]) {
    // int stockPrice[] = { 7, 1, 5, 3, 6, 4 };
    // System.out.println("Maximum profit is : " + stockSellAndBuy(stockPrice));

    // }

    // public static void reverseArray(int numbers[]) {
    // int start = 0;
    // int end = numbers.length - 1;
    // while (start < end) {
    // int temp = numbers[start];
    // numbers[start] = numbers[end];
    // numbers[end] = temp;

    // start++;
    // end--;
    // }
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 2, 4, 6, 8, 10, 12 };
    // reverseArray(numbers);
    // System.out.println("Reverse of an array is : ");
    // for (int i = 0; i < numbers.length; i++) {
    // System.out.print(numbers[i] + " ");
    // }

    // }

    // public static void pairArray(int numbers[]) {
    // int tc = 0;
    // for (int i = 0; i < numbers.length; i++) {
    // int curr = numbers[i];
    // for (int j = i + 1; j < numbers.length; j++) {
    // System.out.print("(" + curr + "," + numbers[j] + ")" + " ");
    // tc++;
    // }
    // System.out.println();
    // }
    // System.out.println("Total count is : " + tc);
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 2, 4, 6, 8, 10, 12 };
    // pairArray(numbers);

    // }

    // public static void subString(int numbers[]) {
    // int small = Integer.MAX_VALUE;
    // int large = Integer.MIN_VALUE;
    // int num = 0;
    // // int tc = 0;
    // for (int i = 0; i < numbers.length; i++) {
    // int start = i;
    // for (int j = i; j < numbers.length; j++) {
    // int end = j;
    // for (int k = start; k <= end; k++) {
    // // System.out.print(numbers[k] + " ");
    // num = num + numbers[k];
    // // tc++;
    // if (num > large) {
    // large = num;
    // }
    // if (num < small) {
    // small = num;
    // }
    // }
    // num = 0;
    // System.out.println();
    // }
    // System.out.println();
    // }
    // // System.out.println("total count is : " + tc);
    // System.err.println("Small sum is " + small + " " + "Large sum is " + large);
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 2, 4, 6, 8, 10, 12 };
    // subString(numbers);

    // }

    // public static void maxSum(int numbers[]) {
    // int large = Integer.MIN_VALUE;
    // int currSum = 0;
    // for (int i = 0; i < numbers.length; i++) {
    // int start = i;
    // for (int j = i; j < numbers.length; j++) {
    // int end = j;
    // currSum = 0;
    // for (int k = start; k <= end; k++) {
    // currSum = currSum + numbers[k];
    // }
    // System.out.println(currSum);
    // if (currSum > large) {
    // large = currSum;
    // }
    // }
    // }
    // System.out.println("Largest sum is : " + large);
    // }

    // public static void main(String args[]) {
    // int numbers[] = { 1, -2, 6, -1, 3 };
    // maxSum(numbers);
    // }

    // public static void prefixSum(int numbers[]) {
    // int large = Integer.MIN_VALUE;
    // int currSum;

    // int prefix[] = new int[numbers.length];
    // prefix[0] = numbers[0];
    // for (int i = 1; i < numbers.length; i++) {
    // prefix[i] = prefix[i - 1] + numbers[i];
    // }

    // for (int i = 0; i < numbers.length; i++) {
    // int start = i;
    // for (int j = i; j < numbers.length; j++) {
    // int end = j;
    // currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
    // if (currSum > large) {
    // large = currSum;
    // }
    // System.out.print(currSum + " ");
    // }
    // System.out.println();
    // }
    // System.out.println("Largest sum is : " + large);

    // }

    // public static void main(String args[]) {
    // int numbers[] = { 1, -2, 6, -1, 3 };
    // prefixSum(numbers);
    // }

    // public static void kadanes(int numbers[]) {
    // int maxSum = Integer.MIN_VALUE;
    // int currSum = 0;

    // for (int i = 0; i < numbers.length; i++) {
    // currSum = currSum + numbers[i];
    // if (currSum < 0) {
    // currSum = 0;
    // }
    // maxSum = Math.max(maxSum, currSum);
    // }
    // System.out.println("max. sum of subarray is : " + maxSum);
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 1, -2, 6, -1, 3 };
    // kadanes(numbers);
    // }

    // public static int rainWater(int numbers[]) {
    // int n = numbers.length;
    // // left max-array
    // int leftMax[] = new int[n];
    // leftMax[0] = numbers[0];
    // for (int i = 1; i < n; i++) {
    // leftMax[i] = Math.max(leftMax[i - 1], numbers[i]);
    // }

    // // right max-array
    // int rightMax[] = new int[n];
    // rightMax[n - 1] = numbers[n - 1];
    // for (int i = n - 2; i >= 0; i--) {
    // rightMax[i] = Math.max(rightMax[i + 1], numbers[i]);
    // }

    // int trappedWater = 0;
    // for (int i = 0; i < n; i++) {
    // int waterlevel = Math.min(leftMax[i], rightMax[i]);

    // trappedWater += waterlevel - numbers[i];
    // }

    // return trappedWater;
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 4, 2, 0, 6, 3, 2, 5 };
    // System.out.println("Max water can be hold : " + rainWater(numbers));
    // }

    // public static void sharePrice(int prices[]) {

    // }

    // public static void main(String[] args) {
    // int prices[] = { 4, 2, 6, 3, 2, 5 };

    // }

    // // Counting Sort---------------------------
    // public static void countingSort(int arr[]) {
    // int large = Integer.MIN_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // large = Math.max(large, arr[i]);
    // }

    // int count[] = new int[large + 1];
    // for (int i = 0; i < arr.length; i++) {
    // count[arr[i]]++;
    // }

    // int j = 0;
    // for (int i = 0; i < count.length; i++) {
    // while (count[i] > 0) {
    // arr[j] = i;
    // j++;
    // count[i]--;
    // }
    // }
    // }

    // public static void printArray(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    // public static void main(String[] args) {
    // int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
    // countingSort(arr);
    // printArray(arr);

    // }

    // public static int getLargest(int arr[]) {
    //     int largest = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] > arr[largest]) {
    //             largest = i;
    //         }
    //     }
    //     return largest;
    // }

    // public static int secondLarge(int arr[]) {
    //     int largest = getLargest(arr);
    //     int res = -1;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] != arr[largest]) {
    //             if (res == -1) {
    //                 res = i;
    //             } else if (arr[i] > arr[res]) {
    //                 res = i;
    //             }
    //         }
    //     }
    //     return res;
    // }

    // public static void main(String args[]) {
    //     int arr[] = { 5, 20, 12, 20, 8 };
    //     int seclarge = secondLarge(arr);
    //     System.out.println("second largest Number index is :  " + seclarge);
    // }


    // public static void subArray(int numbers[]){
    //     int maxsum = Integer.MIN_VALUE;
    //     int sum = 0;
    //     for(int i=0; i<numbers.length; i++){
    //         for(int j=0; j<numbers.length; j++){
    //             for(int k=i; k<=j; k++){
    //                 System.out.print(numbers[k]+" ");
    //                 sum = sum + numbers[k];
    //             }
    //             if(maxsum<sum){
    //                 maxsum = sum;
    //             }
    //             sum=0;
    //             System.out.println();
    //         }
           
    //     }
    //     System.out.println("Maximum sum is :"+maxsum);
    // }
    // public static void main(String[] args){
    //     int numbers[] = {2,4,6,8,10};
    //     subArray(numbers);


    // }


    // kadanes algorith 
    public static void kadanes(int num[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int ele = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            cs = cs + num[i];
            ele = Math.max(ele,cs);
            if(cs<0){
                cs=0;
            }
            
            ms = Math.max(cs, ms);
            
        }
        if(ms==0){
            ms=ele;
        }
        System.out.println(ms);

    }
    public static void main(String args[]){
        // int num[] = {-2,-3,4,-1,-2,1,5,-3};
        int num[] = {-3,-2,-5,-4,-1};
        kadanes(num);
    }

}
