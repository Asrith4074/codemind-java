import java.util.Scanner;
public class num
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if (a[i] == 1) 
            {
                c++;
            } 
            else 
            {
                c = 0;
            }

            max = Math.max(max, c);
        }
        System.out.print(max);
            
    }
}