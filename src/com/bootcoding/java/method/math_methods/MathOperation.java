package com.bootcoding.java.method.math_methods;

public class MathOperation {
    public static void main(String[] args) {

        double abs =  Math.abs(-20);

      double  ceil= Math.ceil(20.9);   //.1  to .9   increase 1
      double round=  Math.round(20.2);  // .1 to .4 as it is number , or .5 to .9  increase 1
      double floor=  Math.floor(20.5);  // .1 to .9 as it is number
//        System.out.println(abs);

//       int min =   Math.min(12, 9);
//       int max =   Math.max(12, 9);
//
//        System.out.println(min);
//        System.out.println(max);

//        System.out.println(ceil);
//        System.out.println(round);
//        System.out.println(floor);


         double pow = Math.pow(4,2);
         double sqRoot = Math.sqrt(16);



        System.out.println(pow);
        System.out.println(sqRoot);

        double v = Math.PI;
        System.out.println("pi "+  v);
    }
}
