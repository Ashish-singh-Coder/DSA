import java.util.Scanner;
public class ReverseN {
    public static void main(String[] arrg){
        Scanner sc = new Scanner(System.in);

        int num = 123;
        int rem = 0;
        for(int i = 1; i < num; i++){
             rem = num % 10;
             num++;
             num = num/10;


        }System.out.println(rem);
    }
}
