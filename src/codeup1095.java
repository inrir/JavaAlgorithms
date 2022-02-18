import java.io.*;
import java.util.StringTokenizer;


public class codeup1095 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int[] nums = new int[100000];
            int n = Integer.parseInt(bf.readLine()); // 입력된 갯수를 세기
            int t;
            int a = 100;

            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int i = 1; i <= n; i++) {
                t = Integer.parseInt(st.nextToken());
                nums[i] = t; // 값을 넣기
                a = a>nums[i] ? nums[i]:a;
            }
            System.out.println(a);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}