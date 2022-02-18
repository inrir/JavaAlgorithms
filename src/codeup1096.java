import java.io.*;
import java.util.StringTokenizer;


public class codeup1096 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int [][]nums = new int[20][20];
            int n = Integer.parseInt(bf.readLine()); // 입력된 갯수를 세기
            int a,b;


            for(int i = 0; i<n; i++){
                StringTokenizer st = new StringTokenizer(bf.readLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                nums[a][b] = 1;

            }
            for(int i = 1; i<20;i++){
                for(int j = 1;j<20;j++){
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println();
            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}