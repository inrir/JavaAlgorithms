import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(System.out));


        int[][] nums = new int[10][10];
        for (int i = 0; i<10;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());// 위치 중요
            for(int j = 0;j<10;j++){
                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int a = 1, b=1;
        if(nums[a][b] != 2){
            nums[a][b] = 9;
        }

        while(nums[a][b] != 2){
            if(nums[a][b+1] == 2){
                b += 1;
                nums[a][b] = 9;
                break;
            }
            else if(nums[a+1][b] == 2){
                a += 1;
                nums[a][b] = 9;
                break;
            }
            else if(nums[a][b+1] == 0){
                b += 1;
            }
            else if(nums[a+1][b] == 0){
                a += 1;
            }
            else{
                break;
            }
            nums[a][b] = 9;
        }
        nums[a][b] = 9;

        for(int i =0;i<10;i++){
            for(int j = 0; j<10;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}