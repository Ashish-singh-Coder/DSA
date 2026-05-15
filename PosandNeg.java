import java.util.Scanner;

public class PosandNeg {
    public static void main(String[] arrg){
        Scanner sc = new Scanner(System.in);

       int num;
       System.out.println("Enter the any Negative and Postive number");
       num = sc.nextInt();
      if(num > 0)
    {
        System.out.println("Number is Positive");
      }else if(num < 0)
    {
        System.out.println("Number is Negative");
      }else{
        System.out.println("Number is Zero ");
      }
    }

    
}
