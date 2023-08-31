import java.util.Scanner;
public class color
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%3==0)
        {
            if(n%5==0)
            {
                System.out.printf("PlingPlang");
            }
            else if(n%7==0)
            {
                System.out.printf("PlingPlong");
            }
            else
            {
                System.out.printf("Pling");
            }
        }
        else if(n%5==0)
        { 
             if(n%7==0)
             {
                 System.out.printf("PlangPlong");
             }
             else
             {
                 System.out.printf("Plang");
             }
        }
        else if(n%7==0)
        {
            System.out.printf("Plong");
        }
        else
        {
            System.out.printf("%d",n);
        }
         
    }
}