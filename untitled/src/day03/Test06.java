package day03;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        while (true) {
            switch(a){
                case "A":
                    System.out.println("优秀");
                    break;
                case "B":
                    System.out.println("良好");
                    break;
                case"C":
                    System.out.println("中等");
                    break;
                case"D":
                    System.out.println("及格");
                    break;
                case "E":
                    System.out.println("不及格");
                    break;

                default:

                    System.out.println("输入有误");


            }
        }

    }
}
