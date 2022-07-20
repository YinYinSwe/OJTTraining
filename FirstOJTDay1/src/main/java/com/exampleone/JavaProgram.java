package com.exampleone;

public class JavaProgram {
    static int i;
    String str="First JavaProgram";
    public static void main(String[] args) {
        //int
        int count=11;
        int count2=33;
        int sub=count2-count;
        System.out.println("Your Sub:"+sub);
        //double
        double num1=11.0;
        double num2=12.0;
        double add=num1+num2;
        System.out.println(+add);
        //boolean
        boolean isJtpBest=true;  
        boolean isCold = false;  
        System.out.println(isJtpBest);  
        System.out.println(isCold);  
        //byte
        byte a = 100;  
        System.out.println("Byte :" +a); 
        //short
        short temperature;
        temperature=-200;
        System.out.println("Temperature :" +temperature);  
        
        //long datatype
        long range=423333333L;
        System.out.println("Range  :" +range); 
         //char datatype
        char letter='\u0051';
        System.out.println("Letter :" +letter); 
        //non-primitive Data type
        JavaProgram java=new JavaProgram();
        System.out.println("String :" +java.str); 
        
    }

}
