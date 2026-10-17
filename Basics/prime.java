import java.util.Scanner;
public class prime {
public static void main(String[]arrg)
{
    Scanner Sc = new Scanner(System.in);

    int num;
    System.out.println("Enter the number");
    num = Sc.nextInt();

    Boolean isprime = true;
for(int i = 2; i<= num-1; i++ )
    {
    if (num % 2 == 0)
        {
        isprime = false;
    
    }System.out.println(isprime);
}
}
}  