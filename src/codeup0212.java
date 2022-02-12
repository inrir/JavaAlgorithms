import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup0212 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        //code up 1047 비트연산자 사용하는 방법
       /* int a = Integer.parseInt(bf.readLine());
        System.out.println(String.format("%d",a<<1));*/

        //code up 1048 ~ 1058
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
//        boolean a = Boolean.valueOf(bf.readLine()).booleanValue();
      /*  boolean a = (Integer.parseInt(st.nextToken()) == 1);
        boolean b = (Integer.parseInt(st.nextToken()) == 1);*/
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
//        System.out.println(((a==b)&&(!a))? 1:0);

        //code up 1059 ~ 1066
        /*int a = Integer.parseInt(bf.readLine());
        System.out.println(~a);*/
//        System.out.println(a&b);
//        System.out.println(a|b);
//        System.out.println(a^b);
//        System.out.println(a>b? a:b);
//        System.out.println(((a<b? a:b)<c)? (a<b?a:b):c); // 가장 작은 값을 출력하는 프로그램
        if(a%2 == 0) System.out.println(a);
        if(b%2 == 0) System.out.println(b);
        if(c%2 == 0) System.out.println(c);

//        int a = Integer.parseInt(bf.readLine());
//        char a = bf.readLine().charAt(0);
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());

        /* code up 1067
        if(a%2 == 0) System.out.println("even");
        else System.out.println("odd");
        if(b%2 == 0) System.out.println("even");
        else System.out.println("odd");
        if(c%2 == 0) System.out.println("even");
        else System.out.println("odd");*/

       /* code up 1068
       if(a < 0){
            System.out.println("minus");
            if(a%2 == 0) System.out.println("even");
            else System.out.println("odd");
        }
        else{
            System.out.println("plus");
            if(a%2 == 0) System.out.println("even");
            else System.out.println("odd");
        }*/

        /* code up 1069
        if(a<=100 && a>=90) System.out.println("A");
        else if(a<= 89 && a>=70) System.out.println("B");
        else if(a<= 69 && a>= 40) System.out.println("C");
        else if(a<= 39 && a>= 0) System.out.println("D");
        else System.out.println("nothing");*/

        /*switch(a){
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
                break;
        }*/

       /* code up 1071
       switch(a){
            case 12: case 1: case 2:
                System.out.println("winter");
                break;
            case 3: case 4: case 5:
                System.out.println("spring");
                break;
            case 6: case 7: case 8:
                System.out.println("summer");
                break;
            case 9: case 10: case 11:
                System.out.println("fall");
                break;
            default:
                System.out.println("nothing");
                break;
        }*/
        // goto를 쓰는 것은 바람직하지 않고 쓸데없어서 skip하고 code up 1075 풀겠습니다.
       /* code up 1075
       while(a != 0){
            a -= 1;
            System.out.println(a);
        }*/
       /* code up 1076
       char b = 'a';
        while(b<a+1){
            System.out.print(b+" ");
            b += 1;
        }*/

       /* code up 1077
       for(int i = 0; i<=a;i++){
            System.out.println(i);
        }*/

       /* code up 1079
        int sum = 0;
        for(int i = 1; i<=a;i++){
            if(i%2 == 0) sum = sum + i;
        }
        System.out.println(sum);*/

        /* code up 1079 문제가 요구하는 것이 무엇인지 모르겠다. 그냥 개당 입력을 받던가?
        아니면 많은 양의 입력이 있고 배열을 묶던가 아니면 받는 양의 갯수를 정해주던가
        while(a != 'q'){
            System.out.println(a);
            a = bf.readLine().charAt(0);
        }*/
    }
}
