import java.util.Scanner;
public class file{
    public static void main(String args[]) {
        int postive =0, negative =0, zeros =0;
        System.out.println("Press 1 to continue & 0 to stop");
     Scanner sc = new Scanner(System.in);
     int input = sc.nextInt();
     while(input == 1) {
      System.out.println("Enter your number : ");
       int number = sc.nextInt();
       if (number>0) {
        postive++ ;
       } else if (number < 0) {
        negative++;
       } else{
        zeros++;
       }
     System.out.println("Press 1 to continue & 0 to stop");
      input = sc.nextInt();
    } 
   System.out.println("Positive : "+ postive);
   System.out.println("negative : "+ negative);
   System.out.println("zeros : "+ zeros);
    }
    }
     
        

  
