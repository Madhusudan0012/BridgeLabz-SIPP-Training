import java.util.*;


public class SumOfDigits{


    //easily we get counts of numbers


    public int get4Random(){
            return (int) (Math.random()*9000)+1000;
        }
    public int countDigits(int number){
        int cnt = 0 , temp = number;
        while(temp > 0){
            cnt++;
            temp/=10;


        }
        return cnt;
    }


    public int[] digits(int number , int count)   {
        //digits we get 
        int[] digits = new int[count];
        int temp = number;
        for(int i = 0 ; i<count ; i++){
            digits[i] = temp%10;
            temp /= 10;
        }
        return digits;

    }
    public int sumArray(int[] arr){
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            sum+=arr[i];
        }
        return sum;
    }



    public static void main(String[] args) {

        SumOfDigits sumOfDigits = new SumOfDigits();

        int number = sumOfDigits.get4Random();

        System.out.println(number);

        int count = sumOfDigits.countDigits(number);

        System.out.println(count);

        int[] digits = sumOfDigits.digits(number, count);

        System.out.println(digits);

        int sum = sumOfDigits.sumArray(digits);

        System.out.println(sum);



        
        
    
        
    }
}
