import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        //code up 1047 비트연산자 사용하는 방법
       /* int a = Integer.parseInt(bf.readLine());
        System.out.println(String.format("%d",a<<1));*/

        //code up 1048 ~ 1058
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        boolean a = Boolean.valueOf(bf.readLine()).booleanValue();
        boolean a = (Integer.parseInt(st.nextToken()) == 1);
        boolean b = (Integer.parseInt(st.nextToken()) == 1);
//        System.out.println(String.format("%d",a<<b));
//        System.out.println(String.format("%d", (a>b)? 1:0));
//        System.out.println(String.format("%d", (a==b)? 1:0));
//        System.out.println(String.format("%d", (a<=b)? 1:0));
//        System.out.println(String.format("%d", (a!=b)? 1:0));
//        System.out.println((a&&b)? 1:0);

//        System.out.println((a&&b)? 1:0);
//        System.out.println((a||b)? 1:0);
//        System.out.println(((a&&!b)||(!a&&b))? 1:0);
//        System.out.println((a==b)? 1:0);
        System.out.println(((a==b)&&(!a))? 1:0);

        //code up 10

    }

}