import java.util.*;;
public class lectureFile {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);

     // Input email
     String email = sc.nextLine();
     String username = "";

     // we are using loop
     for(int i=0; i<email.length(); i++) {
        if(email.charAt(i)=='@') {
            break;
        }else {
            username += email.charAt(i);
        }
     }
     System.out.println(username);
}
}
