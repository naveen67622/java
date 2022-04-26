package Basics;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n%2==0){
            System.out.println(n  + "     is Even");
    } else {
                    System.out.println(n +" is Odd");
                }
        }
        }
}
