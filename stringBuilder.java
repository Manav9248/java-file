import java.util.*;
public class stringBuilder {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      StringBuilder sb = new StringBuilder(name);
      System.out.println("String = "+sb);

      //reversing of stringBuilder
      System.out.println("reverse = "+sb.reverse());
    }
}
