import java.util.Scanner;
public class color
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.printf("Even");
        }
        else
        {
            System.out.printf("Odd");
        }
    }
}