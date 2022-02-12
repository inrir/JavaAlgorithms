import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(bf.readLine());

//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
        /* code up 1081
        int sum = 0, i = 1;
        while(a>sum){
            sum += i;
            i++;
        }
        System.out.println(--i);*/
        /* code up 1082
        for(int i = 1; i<=a;i++){
            for(int j = 1; j<=b;j++){
                System.out.println(i + " " + j);
            }
        }*/
        /* code up 1081
        for(int i = 0x1; i<=0xF;i++){
            System.out.printf("%X*%X=%X\n",a,i,a*i);
        }*/
        /* code up 1084
        for(int i = 1; i<=a; i++){
            if(i%3 == 0) System.out.print("X ");
            else System.out.print(i + " ");
        }*/



    }
}