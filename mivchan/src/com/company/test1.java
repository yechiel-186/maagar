package com.company;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int [] arrey ={1,2,3,4,5,4,3,2,1};

      //  reverse(arrey) ;
        System.out.println(Arrays.toString(arrey));
        //Finaldrom(arrey, 0,arrey.length-1,0);
        //System.out.println(Finaldrom(arrey,0, arrey.length-1,0));
        FinaldromCount(arrey, 0,arrey.length-1,0);
        System.out.println(FinaldromCount(arrey,0, arrey.length-1,0));
}
   /* public static int [] reverse(int arr[]){
       int temp=0;
       int f= arr.length-1;
        for (int x=0;x<arr.length/2;x++){
              temp = arr[x];
              arr[x]=arr[f];
              arr[f]=temp;
              f--;
            }
        return arr;
     }
    public static boolean Finaldrom(int [] arr,int x ,int len,int caunter){
        if (len==x)
        return true;
           if (arr[x]==arr[len]){
               caunter+=1;
               System.out.println(caunter);
               return Finaldrom(arr,x+1,len-1,caunter);
                }
           else return false;
            }*/
    public static int FinaldromCount(int [] arr,int x ,int len,int caunter){
       if (x==len)
           return caunter;
        if (arr[x]==arr[len]){
               caunter+=1;
                 return FinaldromCount(arr, x+1, len-1, caunter);
                }
        else return -1;
            }
        }







