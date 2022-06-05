//Taking input as array, search for number and returns the the index. 

import java.util.Scanner;

public class ArrayIndexing{
      public static void main (String args[]){

         Scanner sc = new Scanner(System.in);
         System.out.println();
          System.out.println(" Enter the size of array:  ");
          int size = sc.nextInt();
          int numbers[] = new int[size];

          System.out.println("--------------------------------------------");
          //Input the values of array list one by one.
          System.out.println("Enter the values for array:  ");
          for(int i = 0; i<size; i++){
                numbers[i] = sc.nextInt();
           }
               System.out.println("--------------------------------------------");
              //Input which value of find.
             System.out.println("Enter the value of the index you want to find :  ");
             int x = sc.nextInt();
     
             System.out.println("======================================");
             //Output the index of the array.
              for(int i=0;  i<numbers.length;  i++){
                  if(numbers[i] == x){
                     System.out.println("The number x is at index : " + i);
              }
           }
      }

}