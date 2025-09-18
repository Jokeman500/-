package day03;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份");
        int year=sc.nextInt();



            if(year%4==0&&year%100!=0||year%400==0)
                System.out.println(year+"年"+"二月有29天");
            else
                System.out.println(year+"年"+"二月有28天");


    }
}

