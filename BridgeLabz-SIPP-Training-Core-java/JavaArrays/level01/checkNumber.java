import java.util.*;

public class checkNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the size of the numbers array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0 ; i<n ; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i = 0 ; i< n ; i++){
            if(numbers[i] == 0){
                System.out.println("Nothing Happen");
            }else if(numbers[i] > 0){
                if(numbers[i] % 2 ==0){
                    System.out.println("Even Number we get");
                }else{
                    System.out.println("Odd Number");
                }
                
            }else{
                System.out.println("Negative Number");
            }
        }
        if(numbers[0] > numbers[n-1]){
            System.out.println("Greater!!");
        }else if(numbers[0] == numbers[n-1]){
            System.out.println("Equal Numbers!");
        }else{
            System.out.println("Less than!");
        }


    }
}
