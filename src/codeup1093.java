import java.io.*;
import java.util.StringTokenizer;


public class codeup1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = new int[24];
        int n = Integer.parseInt(bf.readLine());
        int t;
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i<n;i++){
            t = Integer.parseInt(st.nextToken());
            nums[t] += 1;
        }

        for(int i = 1; i<24;i++){
            System.out.print(nums[i] + " ");
        }


    }
}