import java.util.*;
public class cases
{
    public static void main(String args[])
    {
        int i,l;
        String st;
        char ch;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a word");
        st=s.next();
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            int n=(int)ch;
            int n1=0;
            char ch1=' ';
            if(n>=65 && n<=90)
            {
                n1=n+32;
                ch1=(char)n1;
                System.out.print(ch1);
            }
            if(n>=97 && n<=122)
            {
                n1=n+32;
                ch1=(char)n1;
                System.out.print(ch1);
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}