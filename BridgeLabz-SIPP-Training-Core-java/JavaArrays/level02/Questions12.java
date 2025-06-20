package JavaArrays.level02;

import java.util.*;
public class Questions12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Maths Marks");
        int Maths = sc.nextInt();
        System.out.println("Write Physics Marks");
        int Physics = sc.nextInt();
        System.out.println("Write Chemistery Marks");
        int Chemistery = sc.nextInt();

        int totalMarks = Maths + Physics + Chemistery;

        int percentage = totalMarks/300*100;
        

        //grades system
        if(percentage >= 80){
            System.out.println("pass with A grade");
        }
        else if(percentage>=70 && percentage<=79){
            System.out.println("Pass with B grade");
        }else{
            System.out.println("Pass with Waste Grades");
        }

    }
    
}