import java.util.Scanner;

public class output{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Score of the student");
        int score = sc.nextInt();

        if(score < 0 || score > 100){
            System.err.println("Invalid Grades");
            System.exit(0);


        }
        if(score > 50){
            System.out.println("Congrats you pass the Exam");
        }else{
            System.out.println("Fail sorry better luck next time");
        }
        sc.close();

    }
}