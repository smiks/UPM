import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
 
public class N1 {
 
    public static void main(String[] args) throws IOException {
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] vr1 = br.readLine().split(" ");
         
        int N = Integer.parseInt(vr1[0]);
        int M = Integer.parseInt(vr1[1]);
        int C = Integer.parseInt(br.readLine());
         
        ArrayList<HashMap<Integer, Integer>> hm = new ArrayList<HashMap<Integer, Integer>>();
        int[] best = new int[N];
        for(int i = 0; i < N; i++){
            best[i] = Integer.MAX_VALUE;
            hm.add(i, new HashMap<Integer, Integer>());
        }
 
        best[C] = 0;
          
        for(int i= 0; i < M; i++){
            String[] vr = br.readLine().split(" ");
            int a = Integer.parseInt(vr[0]);
            int b = Integer.parseInt(vr[1]);
            int p = Integer.parseInt(vr[2]);
            hm.get(b).put(a, p);
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