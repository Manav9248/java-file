public class randomFile {
    public static void main(String args[]) {
   
       int n = 5;  // 0101(in decimal)
      int position = 3;

      int bitMask = 1<<position;

      if((bitMask & n)==0);
      System.out.println("bitmask is zero ");
    } else {
        System.out.println("Bitmask is not zero ");
    }
}
