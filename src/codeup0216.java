import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup0216 {
    public static void main(String[] args) throws IOException {
                BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(System.out));
                StringTokenizer st = new StringTokenizer(bf.readLine());

//        int a = Integer.parseInt(bf.readLine());

                int h = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());
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
        /* code up 1083
        for(int i = 1; i<=a; i++){
            if(i%3 == 0) System.out.print("X ");
            else System.out.print(i + " ");
        }*/

       /* code up 1084 계속 시간초과로 인해 해결 못함..
       int count = 0;
        String t = "";
        for(int i = 0; i<a;i++){
            for(int j = 0; j<b;j++){
                for(int k = 0; k<c;k++){
                    t = i+" "+j+" "+k+"\n";
                    count++;
                    bo.write(t);
                    bo.flush();

                }
            }
        }
        System.out.print(count);
        bo.close();*/
       /* int count = 0;
        String t =" ";
        int i =0, j=0, k =0;
        while(true){
            j=0;
            if(i == a) break;

            while(true){
                k=0;
                if(j == b) break;

                while(true){
                    if(k == c) break;
                    t = i+" "+j+" "+k+"\n";
                    count++;
                    k++;
                    bo.write(t);
                    bo.flush();
                }
                j++;
            }
            i++;
        }
        System.out.println(count);*/

        /*unsigned long int summ = h*b*c*s/8;
        int count = 0;
        String plus = "byte";
        summ /= 8;
        double average = 0;
        double sum = 0;
        while(true){
            average = (double)summ/1024;
            if(average < 0.1)break;
            sum = (double)summ/1024;


            count++;

        }
        switch(count){
            case 0:
                System.out.println(String.format("%.1f",sum) + " bit");
                break;
            case 1:
                System.out.println(String.format("%.1f",sum) + " KB");
                break;
            case 2:
                System.out.println(String.format("%.1f",sum) + " MB");
                break;
            case 3:
                System.out.println(String.format("%.1f",sum) + " GB");
                break;
        }
*/

            }
        }