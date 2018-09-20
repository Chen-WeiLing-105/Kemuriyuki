import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner nmb=new Scanner(System.in);
        int v1 , v2 ,v3 ;
        System.out.println("請輸入國文成績:");
        v1 = nmb.nextInt();
        //System.out.println("請輸入英文成績:");
        //v2 = nmb.nextInt();
        //System.out.println("請輸入數學成績:");
        //v3 =nmb.nextInt();

        if( 0<=v1 && v1<=100  ){
            System.out.println("請輸入英文成績:");
            v2 = nmb.nextInt();

            if(v2<=100 && v2 >= 0){

                System.out.println("請輸入數學成績:");
                v3 =nmb.nextInt();

                if(v3<=100 && v3>=0){
                    System.out.println(" 總成績 : " + (v1 + v2 + v3));
                    System.out.println(" 平均成績 : " + (v1 + v2 + v3) / 3);

                }else { System.out.println("數學成績輸入錯誤!"); }

            }else {System.out.println("英文成績輸入錯誤!"); }

        }else {System.out.print("國文成績輸入錯誤!"); }


        }


	// write your code here
    }

