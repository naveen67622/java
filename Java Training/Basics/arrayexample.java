package Basics;


public class arrayexample {
    public static void main(String[] args) {
        int [] arr  = new int [5];
    
    arr[4] = 10;
    arr[0] = 76;
    arr[2] = 22;
    arr[1] = 8;
    arr[3] = 0;
    int  sum  = 0;

    for (int  i : arr){
        sum = sum+i;
    }
    System.out.println("sum = " + sum);
}
}