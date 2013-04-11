import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
 
public class N1 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        String[] vr1 = sc.nextLine().split(" ");
         
        int N = Integer.parseInt(vr1[0]);
        int M = Integer.parseInt(vr1[1]);
         
        int C = Integer.parseInt(sc.nextLine());
         
        ArrayList<HashMap<Integer, Integer>> hm = new ArrayList<HashMap<Integer, Integer>>();
        int[] best = new int[N];
        for(int i = 0; i < N; i++){
            best[i] = Integer.MAX_VALUE;
            hm.add(i, new HashMap<Integer, Integer>());
        }
 
        best[C] = 0;
         
        for(int i= 0; i < M; i++){
            String[] vr = sc.nextLine().split(" ");
            int a = Integer.parseInt(vr[0]);
            int b = Integer.parseInt(vr[1]);
            int p = Integer.parseInt(vr[2]);
            //hm.get(a).put(b, p);
            hm.get(b).put(a, p);
            //System.out.println(a+" "+b+" "+p);
        }
         
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(C);
        while(!arr.isEmpty()){
            ArrayList<Integer> arb = new ArrayList<Integer>();
            for(int n : arr){
                HashMap<Integer, Integer> tmp = hm.get(n);
                for(int i : tmp.keySet()){
                    int d = tmp.get(i) + best[n];
                    if(d < best[i]){
                        //System.out.println("i: " + i +" n: " + n + " tmp: " + tmp.get(i) + " best " + best[n]);
                        arb.add(i);
                        best[i] = d;
                    }
                }
            }
            arr = arb;
        }
        for (int i : best) {
            System.out.println(i);
        }
    }   
 
}