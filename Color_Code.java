import java.util.Scanner;
public class color
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c=='v' || c=='V')
        {
            System.out.printf("Violet");
        }
        else if(c=='i' || c=='I')
        {
            System.out.printf("Indigo");
        }
        else if(c=='b' || c=='B')
        {
            System.out.printf("Blue");
        }
        else if(c=='g' || c=='G')
        {
            System.out.printf("Green");
        }
        else if(c=='y' || c=='Y')
        {
            System.out.printf("Yellow");
        }
        else if(c=='o' || c=='O')
        {
            System.out.printf("Orange");
        }
        else if(c=='r' || c=='R')
        {
            System.out.printf("Red");
        }
        else
        {
            System.out.printf("-1");
        }
    }
}