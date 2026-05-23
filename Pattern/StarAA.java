import java.util.Scanner;
public class StarAA{
    public static void main(String[] arrg){
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter the number");
        num = sc.nextInt();

        for(int i = 0; i< num; i++){
            char ch = 'A' + i;
            for (int j= 0; j<i; j++){
                 System.out.print(ch);

            }System.out.print("\n");
           

        }
    }
}