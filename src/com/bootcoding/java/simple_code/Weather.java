package com.bootcoding.java.simple_code;

class Weather{

public static void main (String args[]){

int temp = 100 ;


if(temp< 20){

System.out.println("Cool");

}else if(temp> 20  && temp< 30){

System.out.println("Normal");
}else if(temp > 30 && temp < 40){

System.out.println("Hot");

}else if(temp > 40){
System.out.println("Warm");
}



}


}