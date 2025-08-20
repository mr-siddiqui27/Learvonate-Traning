package Lecture_6;

public class Searching {
    public static int linearSearch(int [] arr, int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int k){
        int st = 0;
        int end = arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==k) return mid;
            if(arr[mid]<k){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(linearSearch(arr,10));
        System.out.println(binarySearch(arr,5));
    }
}
