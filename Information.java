/*
This is a program that outputs my name, age, and hobby 
*/

//Author Rafael Santos


import java.util.Scanner;

public class Information
{
   // this is the entry of a Java program
   public static void main(String arg[])
   {
   
   String name = "Rafael Santos";
   String hobby = "Playing";
   int bornyear = 2001, age = 18, currentyear = 2020;
   boolean older_21=false; 
   double sum=0, prereq_marks,  averagescore = 67.345;
   Scanner input  = new Scanner(System.in);
      
   //User input 
   System.out.println("What is your name?");
   name = input.nextLine();
   
   System.out.println("What is yout hobby - type in one word?");
   hobby = input.next();
   
   System.out.println("Which year were you born?");
   bornyear = input.nextInt();
   
   //System.out.println("What is the average score?");
   //averagescore = input.nextDouble();
   
   for(int i=1; i<=3; i++)
   {
   do
   {
       System.out.println("Enter mark between 50 and 100 for course " + i);
       prereq_marks = input.nextDouble();
       sum = sum + prereq_marks;
   
     }while(prereq_marks<50 || prereq_marks>100);
   
   }
   
   //Processing details
   averagescore = sum/3;
   age = currentyear - bornyear;
   
   
   if(age<21)
   { 
    older_21 = true;
    
   }
   
   //Output
   System.out.println("My Details");
   System.out.println("-----------");
   System.out.println("Name: " + name);
   System.out.print("Hobby: " + hobby);
   System.out.println();
   System.out.println("Year of birth: " + bornyear);
   System.out.printf("Average score %.1f", averagescore);
   System.out.println();
   if(older_21==true)
     System.out.println("You are enrolled!");
    else
     System.out.println("You are younger than 21 - sorry you are not enrolled");
     
   
   
   
   
   }
   
}

//made with Coursera guided projetc
