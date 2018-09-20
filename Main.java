import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" 請輸入一個 1~3000 之間的正整數代表西元年 : ");
        Scanner scn =new Scanner(System.in);
        int v1;
        v1 = scn.nextInt( );

        if( v1%4 ==0 ) {
            System.out.println( " 閏年 "+" TRUE ");

        }else { System.out.println( "平年 " + " FALSE "); }



	// write your code here
    }
}
