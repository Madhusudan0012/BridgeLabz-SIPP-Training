import java.util.Scanner;

public class StoreMaximumValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        System.out.println("Write Array to find totalSum!");
        int[] numbers = new int[n];
        for(int i = 0 ; i<n ; i++){
            int x = sc.nextInt();
            if(x==0 || x<0){
                for(int val : numbers){
                    int totalSum = 0;
                    totalSum+=val;
                System.out.println(numbers[i]);
                System.out.println(totalSum);
                }
           
            } 
        }
    }
    
}
