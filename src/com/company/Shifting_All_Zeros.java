package com.company;

public class Shifting_All_Zeros {
    public static void main(String[] args) {
        int[] arr={1,5,3,2,3,2,2,4,7,0,3,0,0,0,5,304,0,98,0,0,3,5,8,8};
//        int traverse=0;
//        int last_non_zero=0;
//        //Shfting all zeros to last here.
//        for(traverse=0;traverse<arr.length;traverse++){
//            if(arr[traverse]!=0){
//                arr[last_non_zero++]=arr[traverse];
//            }
//        }
//        for(int i=last_non_zero;i<arr.length;i++)
//            arr[i]=0;
//        for(int i=0;i<arr.length;i++)
//            System.out.println(arr[i]);
//
//
        //Shifting all zeros to first.

        int i=arr.length-1;
        int j= arr.length;
        for(;i>=0;i--){
            if(arr[i]!=0)
                arr[--j]=arr[i];
        }
        for(int k=j-1;k>=0;k--)
            arr[k]=0;
        for(int k=0;k<arr.length;k++)
            System.out.println(arr[k]);

    }
}
