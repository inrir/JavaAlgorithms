import java.io.*;
import java.util.StringTokenizer;


public class codeup1098 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());// 위치 중요

        int h, w;
        int n;
        int l, d, x, y;
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        int [][] nums = new int[h][w];
        for(int i = 0; i< h; i++){
            for(int j = 0;j<w;j++) {
                nums[i][j] = 0;
            }
        }
        n = Integer.parseInt(bf.readLine());


        for(int i = 0; i<n; i++){
            StringTokenizer stt = new StringTokenizer(bf.readLine());// 위치 중요
            l = Integer.parseInt(stt.nextToken());
            d = Integer.parseInt(stt.nextToken());
            x = Integer.parseInt(stt.nextToken());
            y = Integer.parseInt(stt.nextToken());
            if(d == 0){
                for(int j = 0; j<l;j++){
                    nums[x-1][y+j-1]=1;
                }
            }
            else{
                for(int j=0;j<l;j++){
                    nums[x+j-1][y-1] =1;
                }

            }

        }
        for(int i = 0; i<h;i++){
            for(int j = 0;j<w;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}