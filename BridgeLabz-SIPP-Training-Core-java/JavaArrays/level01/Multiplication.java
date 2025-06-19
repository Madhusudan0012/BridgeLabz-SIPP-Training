import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number!");
        int n = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 1; i<=arr.length ; i++){
            int ans = n*arr[i];
            System.out.println(ans+"*"+i);

        


        }
      


    }
}
