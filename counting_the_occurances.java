import java.util.Scanner;
public class occ
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char st = sc.next().charAt(0);
        int c=0;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)==st)
            {
                c+=1;
            }
        }
        if(c==0)
        {
            System.out.print(-1);
        }
        else
        {
            System.out.print(c);
        }
    }
}