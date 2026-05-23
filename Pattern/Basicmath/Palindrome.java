import java.util.Scanner;


public class Palindrome {
   
    public static void main(String[] arrg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:");
        int n = sc.nextInt();

        int rev = 0;
        int dup = n;

        while(n>0)
       {

            int ld = n%10;
            rev= (rev * 10)+ld;

            n = n/10;
        }
        if(dup == rev )
            
        {
            System.out.print("true");
        }else System.out.print("False");



        }

        
    }
    

