import java.io.*;
import java.util.StringTokenizer;


public class codeup1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
/*
3명이 같은 날 -> 3일 마다, 7일 마다, 9일 마다
처음 후 63일 만에 다시

 */
        int day = 1;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        while(day%a!=0 || day%b != 0 || day%c !=0) day++;
        System.out.println(day);




    }
}