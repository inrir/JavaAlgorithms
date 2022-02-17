import java.io.*;
import java.util.StringTokenizer;


public class codeup1088{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(bf.readLine());

        for(int i = 1; i<=a;i++){
            if(i%3 == 0)
                continue;
            System.out.print(i + " ");
        }

    }
}