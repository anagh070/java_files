import java.util.*;

// This is a Java Program to add two Binary numbers which are entered by a user
class add
{
    public static void main(String args[])
    {
        // Defining the variables to store the numbers as well as their sum
        String a , b, ans;
        int x , y;
        // Importing scanner class
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a and b in binary.");
        
        // Taking binary user input from the user and storing as a string
        a = sc.nextLine();
        b = sc.nextLine();
        
        // Converting a and b to their respective decimal equivalent from user input binary stored as a string.
        x = Integer.parseInt(a,2);
        y = Integer.parseInt(b,2);
        
        // Performing addition of the decimal equivalent numbers.
        ans = Integer.toBinaryString(x + y);
        
        // Printing the result
        System.out.println(ans);
    }
}
