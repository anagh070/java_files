import java.util.*;

class anaghfunc 
{
    int a,a1,b,b1,s,ans;
    static int d;

    anaghfunc(int m, int n) 
    {
        a = m;
        b = n;
    }

    void opp() 
    {        {
            if(a==1)
            {
                a1=0;
            }
            else
            {
                a1=1;
            }
        }
        {
            if(b==1)
            {
                b1=0;
            }
            else
            {
                b1=1;
            }
        }
    }

    void calculate(int c)
    {
        s=c;
        switch(s)
        {
            case 1:
                ans=a*a;
                System.out.println(ans);
                break;
            case 2:
                ans=a+b;
                if(ans==2)
                {
                    ans=1;
                }
                System.out.println(ans);
                break;
            case 3:
                System.out.println(a1+b1);
                break;
            case 4:
                ans=a1+b;
                System.out.println(ans+"a'+b");
                break;
            case 5:
                ans=(a1*b1)+(a*b);
                System.out.println(ans+"(a'.b')+(a.b)");
                break;
        }
    }

    void display() 
    {
        System.out.println("Answer is " + ans);
        d = ans;
    }

    public static void main(String args[])
    {
        int a,b,c,ans,rep=0;
        Scanner sc = new Scanner(System.in);
        do {
            if (rep == 1 || rep == 0) 
            {
                System.out.println("enter 1/0 for a , b");
                a=sc.nextInt();
                b=sc.nextInt();
                anaghfunc ob = new anaghfunc(a, b);
                ob.opp();
                System.out.println("enter:1 for '.or^'-AND operator/conjunction"); 
                System.out.println("enter:2 for '+orv'-OR operator/disjunction");
                System.out.println("enter:3 for '~or''-NOT operator/negation");
                System.out.println("enter:4 for 'if....then or => or ->'-implication/conditional");
                System.out.println("enter:5 for '<=> or <->'-equivalence/biconditional");
                c=sc.nextInt();
                ob.calculate(c);
                ob.display();
            } else 
            {
                System.out.println("enter the second number");
                b=sc.nextInt();
                a=d;
                anaghfunc ob = new anaghfunc(a, b);
                ob.opp();
                System.out.println("enter:1 for '.or^'-AND operator/conjunction"); 
                System.out.println("enter:2 for '+orv'-OR operator/disjunction");
                System.out.println("enter:3 for '~or''-NOT operator/negation");
                System.out.println("enter:4 for 'if....then or => or ->'-implication/conditional");
                System.out.println("enter:5 for '<=> or <->'-equivalence/biconditional");
                c=sc.nextInt();
                ob.calculate(c);
                ob.display();
            }
            System.out.println("press 1 to retry, 2 to continue, 3 to end");
            rep = sc.nextInt();
        } while (rep == 1 || rep == 2);
    }
}
