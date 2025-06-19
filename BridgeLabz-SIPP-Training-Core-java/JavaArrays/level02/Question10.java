package JavaArrays.level02;
import java.util.*;


public class Question10 {
    public static void main(String[] args) {
        //create fizzbuzz program 
        //write
        // 3 divisible  fizz 
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number which you want to see in the result");
        int number = sc.nextInt();
        if(number>0){
        String[] results = new String[number+1];
        for(int i = 0 ; i<= number ; i++){
            if(i%3==0 && i%5==0 & i!=0){
                results[i] = "fizzbuzz";


            }else if(i%3==0){
                results[i] = "fizz";
            }else if(i%5==0){
                results[i] = "buzz";
            }else{
                results[i] = String.valueOf(i);
            }
        }


        
        for(int i = 0 ; i<= number ; i++){
            System.out.println("number" + i + "=" + results[i]);
        }
    }
    else{
        System.out.println("Enter Positive number!");
    }


        
        }
    
}
