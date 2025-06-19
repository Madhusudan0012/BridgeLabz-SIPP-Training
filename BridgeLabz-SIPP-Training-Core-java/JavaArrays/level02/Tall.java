import java.util.*;
import java.util.Scanner;
public class Tall{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[] age = new int[n];
        for(int i = 0 ; i<n ; i++){
            age[i] = sc.nextInt();
        }
        int[] heights = new int[n];
        for(int i = 0 ; i<n ; i++){
            heights[i] = sc.nextInt();
        }
        //write logic part
        int amar = age[0];
        int Akbar = age[1];
        int Anthony = age[2];

        Arrays.sort(age);
        System.out.println(age[2]);
        


    }

}