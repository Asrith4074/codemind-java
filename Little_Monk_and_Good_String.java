import java.util.Scanner;
public class monk
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res=0;
        int c=0;
        String vowels="aeiou";
        for(int i=0;i<s.length();i++)
        {
             
            if(vowels.contains(""+s.charAt(i)))
            {
                c++;
            }
            else
            {
                res=Math.max(res,c);
                c=0;
            }
    
       
        }
        System.out.print(Math.max(res,c));
    }
}