import java.util.Scanner;
public class LargestofTwo {
    public static void main(String[]arrg)
    {
        Scanner sc = new Scanner(System.in);

        int num1;
        System.out.println("Enter the First Number :");
        num1 = sc.nextInt();
        int num2;
        System.out.println("Enter the 2nd Number :");
        num2 = sc.nextInt();   
        if(num1>num2){
            System.out.println("Number 1 is Largest : ");
        }else{
            System.out.println("Number 2 is Largest : ");
        }
        
        }
    
    
}
