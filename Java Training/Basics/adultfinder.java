package Basics;

import java.util.Scanner;



public class adultfinder {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:- ");
        String name = sc.nextLine();

        System.out.println("Enter your age:- ");
        int age =sc.nextInt();
    
    if (age>=18){
        System.out.println(name +  "     you are adult");
    
     } else if (age < 0){
        System.out.println("Invalid age!");
    }else{
        System.out.println(name +"       is not an adult");
    }
    sc.close();
}
}