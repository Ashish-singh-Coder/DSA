import java.util.Scanner;
public class Factorial {
    public static void main(String[]arrg){
       Scanner sc = new Scanner(System.in);
       int num;
       int fact = 1;
       System.out.println("Enter the number");
       num = sc.nextInt();
       for(int i = 1; i <= num; i++){
         fact *= i;
       } System.out.println("value of the factorial" + num + "is : " + fact);
    }
    
}
