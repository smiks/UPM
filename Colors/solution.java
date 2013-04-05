import java.util.Scanner;

public class Vzorci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stv = Integer.parseInt(in.nextLine());
        for(int i = 0; i < stv; i++){
            String vr1 = in.nextLine();
            String vr2 = in.nextLine();
             
            String tmp = "";
            for (int j = 0; j < vr1.length(); j++) {
                tmp += vr1.charAt(j)==vr2.charAt(j)? "r" : "b";
            }
            System.out.println(tmp);
        }
    }
 
}