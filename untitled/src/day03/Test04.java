package day03;

import java.util.Scanner;

public class Test04
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=10;
        int b=3;
        int c;

        System.out.println("请输入星期的数字");
        a=sc.nextInt();

        if(a>0&&a<8)
        {
            if(a==7)
                System.out.println("狗恭喜你今天是开心的一天");
            else
            {
                System.out.println("又一个死亡轮回");
            }
        }
        else
        {
            System.out.println("数字不合法");
        }

/*
        if(a>b)
            a=b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==b)
            System.out.println("你摸了一个对子");
        //创建一个Scanner对象，输出提示，获取动态输入的整数
*/



    }
}
