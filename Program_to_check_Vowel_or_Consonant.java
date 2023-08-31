import java.util.Scanner;
public class color
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c=='a' || c=='A')
        {
            System.out.printf("Vowel");
        }
        else if(c=='e' || c=='E')
        {
            System.out.printf("Vowel");
        }
        else if(c=='i' || c=='I')
        {
            System.out.printf("Vowel");
        }
        else if(c=='o' || c=='O')
        {
            System.out.printf("Vowel");
        }
        else if(c=='u' || c=='U')
        {
            System.out.printf("Vowel");
        }
        else
        {
            System.out.printf("Consonant");
        }
    }
}