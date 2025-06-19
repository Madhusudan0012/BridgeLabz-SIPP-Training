import java.util.Scanner;

public class sumAllArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Size of the Array!");
        int n = sc.nextInt();

        if(n<0){
            System.out.println("Invalid number!");
            System.exit(0);
        }
        int cnt = 0;
        int temp = n;
        while(temp >0){
            cnt++;
            temp/=10;
        }

        int[] digits = new int[cnt];
        for(int i = 0 ; i<cnt ; i++){
            digits[i] = n%10;
            n/=10;
        }

        int sum = 0;
        for(int i = 0 ;  i<cnt ; i++){
            sum+=digits[i];
        }
        System.out.println("\nSumo of the Digits" + sum);

        sc.close();

    }


    
} 
