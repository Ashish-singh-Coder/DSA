import java.util.Scanner;
public class Sumofn { 
    public static void main(String[]arrg){
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;
        System.out.println("Enter the number");
        num = sc.nextInt();

       for(int i = 1; i <= num; i++){
          sum +=i;
       }System.out.println(" the value of sum : "+ sum);
    }
}
