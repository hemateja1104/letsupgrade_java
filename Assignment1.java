package Java;

import java.util.Scanner;

public class Assignment1 {
	void display(){
		System.out.println("Enter a Number");
		int M = (new Scanner(System.in)).nextInt();
        if(M%3==0 && M%5==0){
            System.out.println("Good Number");
        }
        else if(M%3==0 && M%5!=0){
            System.out.println("Bad Number");
        }
        else if(M%3!=0 && M%5==0){
            System.out.println("Poor Number");
        }
        else{
            System.out.println("-1");
        }
	}
	public static void main(String[]args){
		
        Assignment1 a = new Assignment1();
        a.display();;
    }
}
