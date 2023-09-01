import java.util.*;
class anagh
{
    public static void main(String args[])
    {
        int a,b,c,a1,b1,ans;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1/0 for a , b");
        a=sc.nextInt();
        b=sc.nextInt();
        {
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
        System.out.println("enter:1 for '.or^'-AND operator/conjunction"); 
        System.out.println("enter:2 for '+orv'-OR operator/disjunction");
        System.out.println("enter:3 for '~or''-NOT operator/negation");
        System.out.println("enter:4 for 'if....then or => or ->'-implication/conditional");
        System.out.println("enter:5 for '<=> or <->'-equivalence/biconditional");
        c=sc.nextInt();
        switch(c)
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
} 