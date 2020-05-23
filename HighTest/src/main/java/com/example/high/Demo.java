package com.example.high;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 /**
   * @Author liupan
   * @Description 可变参数demo
   * @Date  2020-05-23 15:51
   */
public class Demo {

    public static void main(String[] args) {
        System.out.println(sum(1, 4, 5));//10
        System.out.println(sum(1, 4, 5, 20));//30
        System.out.println(sum());//0
    }

     public static int sum(int... numbers) {
         int sum = 0;
         for (int number : numbers) {
             sum += number;
         }
         return sum;
     }

}
