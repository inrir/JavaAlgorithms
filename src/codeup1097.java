import java.io.*;
import java.util.StringTokenizer;


public class codeup1097 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(System.out));


        int [][]nums = new int[20][20];

        int a,b;

        for(int i = 1; i<=19;i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());// 위치 중요
            for (int j = 1; j <= 19; j++) {

                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int n = Integer.parseInt(bf.readLine()); // 입력된 갯수를 세기

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            for (int j = 1; j <= 19; j++) {
                if (nums[a][j] == 0) nums[a][j] = 1;
                else nums[a][j] = 0;
            }

            for (int j = 1; j <= 19; j++) {
                if (nums[j][b] == 0) nums[j][b] = 1;
                else nums[j][b] = 0;
            }
        }

        for(int i = 1; i<=19;i++){
            for(int j = 1; j<=19; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}