package Lecture_7;

public class Sorting {

    static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
                int key = arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>key){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1]=key;
        }
    }

    static void bubbleSort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]<nums[i]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,3,5,6,7,2,1};
        insertionSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

