package com.example.sorts;

/**
 * @author liliang
 * @date 2021年03月31日 11:25
 * 选择排序
 */
public class Selection {

    public static void main(String[] args) {
        int[] arr = { 9, 1, 2, 5, 7, 4, 8, 6, 3, 5 };
        sort(arr);

    }




    public static void sort(int[] arr){

       for(int j=0;j<arr.length;j++){
           int min = j;

            for(int i =j;i< arr.length ;i++){
                if(arr[i] < arr[min] ){
                    swap(arr,i,min);
                }
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

