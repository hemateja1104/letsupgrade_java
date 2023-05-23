package Java;

public class Assignment2 {

	    public static boolean isPalindrome(int number) 
	    {
	        int originalNumber = number;
	        int reverse = 0;

	        while (number != 0) {
	            int remainder = number % 10;
	            reverse = reverse * 10 + remainder;
	            number /= 10;
	        }

	        return originalNumber == reverse;
	    }
	    
	    public static void main(String[] args) 
	    {
	    	System.out.print("Enter a number: ");
	    	int number = (new java.util.Scanner(System.in)).nextInt();
    
	    	if (isPalindrome(number)) 
	    	{
	    		System.out.println(number + " is a palindrome number.");
	    	} 
	    	else 
	    	{
	    		System.out.println(number + " is not a palindrome number.");
	    	}
	    }
}
