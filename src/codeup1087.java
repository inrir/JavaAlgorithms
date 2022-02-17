import java.io.*;
import java.util.StringTokenizer;


public class codeup1087 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(bf.readLine());
        int s = 0, i = 1;
        while(true){
            s += i;
            if(s>=a)
                break;
            i++;
        }
        System.out.println(s);

    }
}