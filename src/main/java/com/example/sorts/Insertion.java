package com.example.sorts;

/**
 * @author liliang
 * @date 2021年03月31日 11:25
 * 插入排序
 */
public class Insertion {

    public static void main(String[] args) {
        int[] arr = { 9, 1, 2, 5, 7, 4, 8, 6, 3, 5 };
        sort(arr);

    }


    public static void sort(int[] arr){

            for(int i =1;i<= arr.length-1 ;i++){
                int current =i;
                while (current >=1  && arr[current] < arr[current-1] ){
                    swap(arr,current,current-1);
                    current --;
                }
            }

     printlnAll(arr);

    }
    public static void swap(int[] arr,int i,int j){
        int temp =0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printlnAll(int[] arr){
      for(int i =0 ;i<arr.length;i++){
          System.out.print(arr[i]+" ");
      }
    }
}

