package JavaArrays.level02;
import java.util.*;

public class Question09 {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Write number between 6 and 9");
      int number = sc.nextInt();
      if(number>=6 && number<=9){
         for(int i = 0 ; i<=10 ; i++){
             System.out.println(number + "*" + i + "=" + number*i);
         }
      }else{
         System.out.println("Write number which lie into 6 and 9");
      }


   }
    
}
