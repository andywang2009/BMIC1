package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("请输入你的体重(kg)");
        Scanner scanner = new Scanner(System.in);
        String kg = scanner.next();
        System.out.println("请输入你的身高(米)");
        Scanner scanner1 = new Scanner(System.in);
        String tall = scanner1.next();
        try{
            Double kg1 = Double.parseDouble(kg);
            Double tall1 = Double.parseDouble(tall);
            System.out.println("数值正确 正在计算");
            double BMI = kg1/Math.pow(tall1 , 2);
            if (BMI < 18.5){
                System.out.println("偏瘦");
            }
            else if(BMI >= 18.5 && BMI < 24){
                System.out.println("恭喜你！你的BMI很正常");
            }
            else if(BMI >= 24 && BMI < 28.5){
                System.out.println("你偏重了，控制饮食！");
            }
            else if(BMI > 28){
                System.out.println("你已经严重肥胖了！");
            }
        }
        catch(NumberFormatException e){
            System.err.println("输入错误");
        }
    }
}