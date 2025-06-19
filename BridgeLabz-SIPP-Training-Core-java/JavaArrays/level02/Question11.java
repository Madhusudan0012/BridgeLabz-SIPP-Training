package JavaArrays.level02;

import java.util.Arrays;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Amar Akbar Anthony 
        //based on hight we have to find tallest
        //based on age we have to find aged person
        int n = 3;
        int[] age = new int[n];
        int[] heights = new int[n];


        System.out.println("Write Ages of three of them!");
        for(int i = 0 ; i<n ; i++){
            age[i] = sc.nextInt();
        }
        System.out.println("Write Heights of three!");
        for(int i = 0 ; i<n ; i++){
            heights[i] = sc.nextInt();
        }
       Arrays.sort(age);
       Arrays.sort(heights);
       System.out.println(age[n-1]);
       System.out.println(heights[n-1]);

    }
}
