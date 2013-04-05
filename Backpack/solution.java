import java.util.Scanner;
 
 
public class Nahrbtniki {
    static int j, hr, N, best;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int st = Integer.parseInt(sc.nextLine());
         
        for (int i = 0; i < st; i++) {
            String[] ln1 = sc.nextLine().split(" ");
            j = Integer.parseInt(ln1[0]);
             hr = Integer.parseInt(ln1[1]);
            N = best = Integer.parseInt(ln1[2]);
            findBest();
            System.out.println(N-best);
        }
         
    }
    private static void findBest() {
         int a, b;
        if(j > hr){
            a = j;
            b = hr;
        }else{
            a = hr;
            b = j;
        }
        int i = 0;
        for (int w = N; w > -1 && i <= b; w -= a) {
 
             int tmp = w%b;
            if(tmp == 0){
                best = tmp;
                return;
            }
            if(tmp < best){
                best = tmp;
            }
            i++;
         }
    }
}