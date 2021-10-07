package BRPDay3;

import java.util.Scanner;

public class Harmonic {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter value for harmonic no n: "+n);
        
        double result = nthHarmonic(n);
        if (n>0)
            System.out.println("The harmonic Value for the number is : "+result);
        else
            System.out.println("The number should be non Negative . ");
    }
    public static double nthHarmonic(int n){
        double val = 0.0;
        for (int i=1;i<=n;i++){
            val = val + (1.0/i);
        }
        return val;
    }
}