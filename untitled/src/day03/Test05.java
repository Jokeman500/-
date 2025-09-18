package day03;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price=22;
        int input;
        System.out.println("请输入充值金额：");
        input=sc.nextInt();
        switch(input){
            case 10:
                price+=input;
                break;
            case 20:
                price+=input;
                break;
            case 30:
                price+=input;
                break;
            case 50:
                price+=input;
                break;
            case 100:
                price+=input;
                break;
            case 200:
                price+=input;
                break;

            default:
                System.out.println("输入金额有误");
        }
        if(input>=50&&input<100)
            price+=input;
        else if (input>100&&input<200)
            price+=input;
        System.out.println("skjgsfkgdk");
    }
    public void dd(int a){
        int piice=22;

    }
}
