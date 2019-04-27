import java.util.*;
class Palindrome 
{
    public static void main(String args[] ) throws Exception
    {
        String original,reverse="";
        Scanner s = new Scanner(System.in);
        original = s.nextLine();
        int l = original.length();
        for (int i= l-1;i>=0;i--)
        {
            reverse=reverse+original.charAt(i);
        }
        if (original.equals(reverse))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
