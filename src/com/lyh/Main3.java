package com.lyh;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/5/11 21:20
 * @version: v1.0
 */
public class Main3 {
    public static void main(String args[]){
        int[]dates={23,45,67,896,34};
        for(int item:dates){
            System.out.println(item);
        }//foreach类型的
        System.out.println("----------------");
        for(int i=0;i<dates.length;i++){
            System.out.println(dates[i]);
        }//for类型的
        System.out.println("----------------");
    }
}
