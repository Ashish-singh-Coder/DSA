import java.util.Scanner;

public class Star {
    public static void main(String[] arrg){
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter the number ");
        num = sc.nextInt();
        
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                System.out.print("*");
                
            }System.out.print("\n");
        }

      
    }
}
