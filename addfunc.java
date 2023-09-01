import java.util.*;

class addfunc 
{
    int a, b, ans;
    static int d;

    addfunc(int m, int n) 
    {
        a = m;
        b = n;
    }

    void calculate() 
    {
        ans = a + b;
    }

    void display() 
    {
        System.out.println("Answer is " + ans);
        d = ans;
    }

    public static void main(String args[])
    {
        int f, s, rep = 0;
        Scanner sc = new Scanner(System.in);
        do {
            if (rep == 1 || rep == 0) 
            {
                System.out.println("enter the first number and second number");
                f = sc.nextInt();
                s = sc.nextInt();
                addfunc ob = new addfunc(f, s);
                ob.calculate();
                ob.display();
            } else 
            {
                System.out.println("enter the second number");
                s = sc.nextInt();
                f = d;
                addfunc ob = new addfunc(f, s);
                ob.calculate();
                ob.display();
            }
            System.out.println("press 1 to retry, 2 to continue, 3 to end");
            rep = sc.nextInt();
        } while (rep == 1 || rep == 2);
    }
}
