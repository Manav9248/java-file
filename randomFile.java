public class randomFile {
    public static void main(String args[]) {
   
       int n = 5;  // 0101(in decimal)
      int i = 1;

      int bitMask = 1<<i;
      int newNumber = bitMask | n;

      System.out.println(newNumber);
}
}
