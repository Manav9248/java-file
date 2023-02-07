import java.util.Scanner;

public class abcd {
    public static void main(String args[]) {
        System.out.println("Enter x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();

        int result =1;

    // using loop
    for(int i=0; i<n; i++) {
   result = result * x;
    }
    System.out.println("x to the power n is : "+result);
    } 
}
