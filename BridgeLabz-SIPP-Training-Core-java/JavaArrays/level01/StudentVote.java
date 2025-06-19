import java.util.Scanner;

public class StudentVote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number of Students ");
        int n = sc.nextInt();
        int[] StudentAge = new int[n];
        for(int i = 0 ; i<n ; i++){
            StudentAge[i] = sc.nextInt();
        }
        //check it's give vote or not 
        //check above 18 student
        for(int i = 0 ; i< n ;i++ ){
            if(StudentAge[i] < 18){
                System.out.println("Not Vote");

            }else{
                System.out.println("can be vote");
            }
        }



    }
    
}
