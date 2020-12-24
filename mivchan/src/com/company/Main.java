package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);
        System.out.println(x);
        jumpingNumber(x);
        System.out.println(jumpingNumber(x));
        int [] arr = {3 ,2, 7 , 8, 8, 6};
        int y = rand.nextInt(10);
        System.out.println(y);
        nthPower(arr,y);
        System.out.println(nthPower(arr,y));
    }

    public static boolean jumpingNumber(int x) {
        int modulu = x % 10;
        if (x <= 9) {
            return true;
        }
        if (modulu == (x / 10) % 10 + 1 || modulu == (x / 10) % 10 - 1) {
            return jumpingNumber(x / 10);
        }
        return false;
    }

    public static int nthPower(int[] array, int n) {
        if(n==0){
            return -1;
        }
        int g=0;
            for (int x = 0; x < array.length;x++) {
                if (array[x] == n) {
                  int r = (array[x] ^ n);
                   return r;
                }
            }
            return -1;
    }
}



