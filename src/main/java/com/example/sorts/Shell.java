package com.example.sorts;

/**
 * @author liliang
 * @date 2021年03月31日 11:25
 * 希尔
 */
public class Shell {

    public static void main(String[] args) {
        //int[] arr = { 9, 1, 8, 5, 7, 4, 2, 6, 3, 5 };
        int[] arr = { 9,  8, 7, 6, 5, 4, 3, 2 ,1,0};
        sort(arr);

    }


    public static void sort(int[] arr){

            int leng =arr.length;
            int gap = arr.length/2;
            while (gap > 0){
             System.out.println("  gap......... "+ gap);
                    for(int i =gap;i <leng;i++){
                        int k =i;
                System.out.println("  k.. "+ k);
                        while (k - gap >= 0  && arr[k] < arr[k-gap] ){
                                swap(arr,k,k-gap);
                                System.out.println("  k..k-gap "+ k +" .."+(k-gap));
                              //  System.out.println("k "+k);
                             k = k -gap;
                            }
                    }
                    gap = gap/2;
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

