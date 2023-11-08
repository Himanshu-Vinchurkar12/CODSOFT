import java.util.Random;
import java.util.Scanner;

import javax.swing.*;

class Game
 {
  public void fun(int count)
  {
  if (count ==0)
 {
    System.out.println("Better luck next time");
  }
  if(count >=1 )
 {
    System.out.println("well done!!");
 }
}
    public static void main(String[] args)
   {
        Random random = new Random();
       int x = random.nextInt(100);
       System.out.println("welcome to the guess the number game!!");
        System.out.println("You have 7 chance to guess the number!");
       int count = 0;
               for(int i =1;i<=7;i++)
               {
            
        Scanner obj = new Scanner(System.in);
        System.out.print("Guess the number between 1-100:");
        int num = obj.nextInt();
        
        
         if(num>x)
             {
               System.out.println("your guess is higher than generated number ");
              }
            else if(num<x)
            {
             System.out.println("your is lower than generated number ");
             }
             else if(x-num <= 10 && num-x > 0 )
              {
              System.out.println("you are very close to number");
              }
             else if (num == x)
              {
               System.out.println("your guess is correct ");
               break;
              } 
             }
          }
        }

   