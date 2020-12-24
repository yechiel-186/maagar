package com.company;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10);
        System.out.println(x);
        for (int r = 1; r <= 10; r++) {
            System.out.println(x * r);
        }
        System.out.println("אוטובוס");
        enough(100, 100, 60);
        System.out.println(enough(100, 100, 60));
        int[] arr = {1, 2, 4, 5, 6};
        find(arr);
        System.out.println(find(arr));
        Tikan(5,1);
        int N = 10;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                String temp = i * j + "";
                System.out.print(temp + (temp.length() == 1 ? "  " : " "));
            }
            System.out.println();
        }
    }


    public static int enough(int cap, int on, int wait) {
        if (cap - on == 0) {
            return (-wait);
        } else {
            return (cap - on);
        }
    }

    public static int find(int[] array) {
        int f = 0;
        for (int x = array.length - 1; 0 < x; x--) {
            if (array[x] - array[x - 1] == 1) {
            } else {
                f = array[x - 1];
                break;
            }
        }
        return f;
    }
    public static int Tikan (int x,int y){
     
        }
    }


  }








