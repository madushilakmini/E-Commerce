/*
5)Reverse the left and right numbers like
         You must use only a loop
            input  9
            output 4 3 2 1 5 9 8 7 6

            input 13
            output 6 5 4 3 2 1 7 13 12 11 10 9 8
*/

import java.util.*;
import java.util.Scanner;

public class four{
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a Number: ");
      int number = scanner.nextInt();
      int middle = number/2;
      for (int i = 1; i <= number; i++ )
       {
        if(i <= middle)
        {
          System.out.print((middle-i+1)+" ");  
        }
        else
        {
           if(i == middle + 1)  
           {
              System.out.print(i+" ");  
           }
           else
           {
              System.out.print((number - i+ middle + 2) +" "); 
           }
        }
       }
    }

}