import java.util.*;
public class Sample
{
   public static int Findnoofwords(String s)
{
   int count=0;
   for(int i=0;i<s.length();i++)
{
   if(s.charAt(i)==' '&& s.charAt(i+1)!=' ')
   count++;
}
 return count+1;
}

public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   String str;
   str=sc.nextLine();
   System.out.println(Findnoofwords(str));
}
}