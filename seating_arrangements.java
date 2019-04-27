import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner p = new Scanner(System.in);
       int t = p.nextInt();
       for (;t>=1;t--)
       {
           int n = p.nextInt();
           int r = n%12;
           switch (r)
           {
                case 1:
                   r=n+11;
                   System.out.print(r+" "+"WS");
                   break;
                case 2:
                   r=n+9;
                   System.out.print(r+" "+"MS");
                   break;
                case 3:
                   r= n+7;
                   System.out.print(r+" "+"AS");
                   break;
                case 4:
                   r=n+5;
                   System.out.print(r+" "+"AS");
                   break;
                case 5:
                    r=n+3;
                    System.out.print(r+" "+"MS");
                    break;
                case 6:
                    r=n+1;
                    System.out.print(r+" "+"WS");
                    break;
                case 7:
                    r=n-1;
                    System.out.print(r+" "+"WS");
                    break;
                case 8:
                    r=n-3;
                    System.out.print(r+" "+"MS");
                    break;
                case 9:
                    r=n-5;
                    System.out.print(r+" "+"AS");
                    break;
                case 10:
                    r=n-7;
                    System.out.print(r+" "+"AS");
                    break;
                case 11:
                    r=n-3;
                    System.out.print(r+" "+"MS");
                    break;
                case 0:
                    r=n-1;
                    System.out.print(r+" "+"WS");
                    break;
                    
           }
        System.out.println();
                    
                    }
           
           
       }
}
