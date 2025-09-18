package day03;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份");
        int year=sc.nextInt();
        System.out.println("请输入月份");
        int month=sc.nextInt();
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
            System.out.println(year+"年"+month+"月有31天");
        else if(month==4||month==6||month==9||month==11)
            System.out.println(year+"年"+month+"月有30天");
        else if(month==2)
        {
            if(year%4==0&&year%100!=0||year%400==0)
                System.out.println(year+"年"+month+"月有29天");
            else
                System.out.println(year+"年"+month+"月有28天");
        }
        else
            System.out.println("输入出错");

    }
}
