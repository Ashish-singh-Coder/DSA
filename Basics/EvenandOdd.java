import java.util.Scanner;
public class EvenandOdd {
  public static void main(String[] arrg){
    Scanner oo = new Scanner(System.in);

    int num;
    System.out.println("Enter the Number : ");
    num = oo.nextInt();
    if(num % 2 == 0)
    {
        System.out.println( "Number is Even ");

    }else{
        System.out.println("Number is ODD");

    }


  }
    
}
