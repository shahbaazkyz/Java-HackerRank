import  java.util.*;

public class IfElse {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number to Check");
        int a = input.nextInt();
        String ans ;
        if (a % 2 ==1)
        {
            ans = "Weird";
        }
        else
        {
            if (a>2 && a<5)
            {
                ans = "Not Weird";
            }
            else if (a>5 && a<20)
            {
                ans = "Weird";
            }
            else
            {
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
    }
}
