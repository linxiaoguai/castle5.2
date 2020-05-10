package com.lyh;

import java.util.Scanner;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/5/9 10:58
 * @version: v1.0
 */
public class Main {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("输入：");

        String line=in.nextLine();
        String[]words=line.split("");

        for(String item:words){
            System.out.println(item+"");
        }
    }
}
